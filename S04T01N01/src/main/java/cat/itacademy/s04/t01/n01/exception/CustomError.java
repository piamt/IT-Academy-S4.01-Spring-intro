package cat.itacademy.s04.t01.n01.exception;

public class CustomError {

    int errorCode;
    String msg;

    public CustomError(int errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public CustomError() {
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
