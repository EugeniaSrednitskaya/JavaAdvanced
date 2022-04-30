package JavaAdvanced;

public class Block {
    int width;
    int length;
    int height;

    public Block(int[] arraySizeBlock) {
        this.width = arraySizeBlock[0];
        this.length = arraySizeBlock[1];
        this.height = arraySizeBlock[2];
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }

    public int getVolume() {
        return this.width * this.length * this.length;
    }

    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height + this.height * this.length);
    }

    public static void main(String[] args) {

    }

}
