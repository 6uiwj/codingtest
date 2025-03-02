package order;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BOJ2751_3_opt {

        public static void main(String[] args) throws IOException {
            FastIO io = new FastIO();
            int n = io.nextInt(), maxRange = 1_000_000;
            boolean[] exists = new boolean[maxRange * 2 + 2];
            for (int i = 0; i < n; i++) {
                exists[io.nextInt() + maxRange] = true;
            }

            for (int i = 0, count = 0; i < exists.length & count < n; i++) {
                if (exists[i]) {
                    io.writelnInt(i - maxRange);
                    ++count;
                }
            }
            io.flushAndClose();
        }

        private static class FastIO {

            private static final int BUFFER_SIZE = 1 << 16;
            private final DataInputStream in;
            private final DataOutputStream out;
            private final byte[] inBuffer;
            private final byte[] outBuffer;
            private final byte[] bytebuffer;

            private int inBufferPointer, bytesRead;
            private int outBufferPointer;

            private FastIO() {
                in = new DataInputStream(System.in);
                out = new DataOutputStream(System.out);
                inBuffer = new byte[BUFFER_SIZE];
                outBuffer = new byte[BUFFER_SIZE];
                bytesRead = outBufferPointer = 0;
                bytebuffer = new byte[10];
            }

            private int nextInt() throws IOException {
                byte c = read();
                while (c <= ' ') {
                    c = read();
                }

                boolean neg = (c == '-');
                if (neg) {
                    c = read();
                }

                int ret = 0;
                do {
                    ret = ret * 10 + c - '0';
                } while ((c = read()) >= '0' && c <= '9');

                return neg ? -ret : ret;
            }

            private byte read() throws IOException {
                if (inBufferPointer == bytesRead) {
                    fillBuffer();
                }
                return inBuffer[inBufferPointer++];
            }

            private void fillBuffer() throws IOException {
                bytesRead = in.read(inBuffer, inBufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1) {
                    inBuffer[0] = -1;
                }
            }

            private void writelnInt(int i) {
                writeInt(i);
                writeBuffer((byte) '\n');
            }

            private void writeInt(int i) {
                if (i == 0) {
                    writeBuffer((byte) '0');
                    return;
                }

                if (i < 0) {
                    writeBuffer((byte) '-');
                    i = -i;
                }

                int index = 0;
                while (i > 0) {
                    bytebuffer[index++] = (byte) ((i % 10) + '0');
                    i /= 10;
                }

                while (index-- > 0) {
                    writeBuffer(bytebuffer[index]);
                }
            }

            private void writeBuffer(byte b) {
                if (outBufferPointer == outBuffer.length) {
                    flushBuffer();
                }
                outBuffer[outBufferPointer++] = b;
            }

            private void flushBuffer() {
                if (outBufferPointer != 0) {
                    try {
                        out.write(outBuffer, 0, outBufferPointer);
                    } catch (Exception ignored) {
                    }
                }
                outBufferPointer = 0;
            }

            private void flushAndClose() throws IOException {
                flushBuffer();
                close();
            }

            private void close() throws IOException {
                in.close();
                out.close();
            }
        }
    }


