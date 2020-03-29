package matrix;

public class ColumnMatrix implements Matrix {

    public ColumnMatrix(String str, int rows, int columns) {
        this.name(str);
        this.rows(rows);
        this.columns(columns);

    }

    public String name(String string) {
        return string;
    }

    public Integer rows(Integer rows) {
        return rows;
    }

    public Integer columns(Integer columns) {
        return 1;
    }


}
