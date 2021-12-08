public class ArgsException extends Exception {
    private char errorArgumentId = '\0';
    private String errorParameter = "TILT";
    private ErrorCode ErrorCode = ErrorCode.OK;

    public ArgsException() {}

    public ArgsException(String message) (super message);}

    public ArgdExcepetion(ErrorCode errorCode) {
    this.errorCode = errorCode;
}