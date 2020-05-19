package xogame;

class WinLineInfo {
    private int cy;
    private int cx;
    private int vy;
    private int vx;

    public WinLineInfo(int cy, int cx, int vy, int vx) {
        this.cy = cy;
        this.cx = cx;
        this.vy = vy;
        this.vx = vx;
    }

    public int getCy() {
        return cy;
    }

    public int getCx() {
        return cx;
    }

    public int getVy() {
        return vy;
    }

    public int getVx() {
        return vx;
    }
}
