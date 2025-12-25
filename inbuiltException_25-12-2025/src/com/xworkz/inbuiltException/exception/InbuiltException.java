package com.xworkz.inbuiltException.exception;

import javax.transaction.xa.XAException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;

public class InbuiltException {
    public void aclNotFoundException()throws AclNotFoundException{
        throw  new AclNotFoundException();
    }
    public void fileAlreadyExistsException()throws FileAlreadyExistsException{
        throw new FileAlreadyExistsException("");
    }
    public void arithmeticException()throws ArithmeticException{
        throw new ArithmeticException();
    }
    public void arrayIndexOutOfBoundsException()throws ArrayIndexOutOfBoundsException{
        throw new ArrayIndexOutOfBoundsException();
    }
    public void sQLException()throws SQLException{
        throw new SQLException();
    }
    public void nullPointerException()throws NullPointerException{
        throw new NullPointerException();
    }
    public void numberFormatException()throws NumberFormatException{
        throw new NumberFormatException();
    }
    public void xAException()throws XAException{
        throw new XAException();
    }
    public void runtimeException()throws RuntimeException{
        throw new RuntimeException();
    }
    public void fileSystemException()throws FileSystemException {
        throw new FileSystemException("");
    }
}
