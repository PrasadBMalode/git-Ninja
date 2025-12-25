package com.xworkz.inbuiltException.outer;

import com.xworkz.inbuiltException.exception.InbuiltException;

import javax.transaction.xa.XAException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.security.acl.AclNotFoundException;
import java.sql.SQLException;

public class InbuiltExceptionRunner {
    public static void main(String[] args) throws AclNotFoundException,
            FileAlreadyExistsException,ArithmeticException,ArrayIndexOutOfBoundsException,
            SQLException,NullPointerException,NumberFormatException, XAException,
            RuntimeException, FileSystemException {

        InbuiltException obj=new InbuiltException();

        obj.aclNotFoundException();
        obj.fileAlreadyExistsException();
        obj.arithmeticException();
        obj.arrayIndexOutOfBoundsException();
        obj.sQLException();
        obj.nullPointerException();
        obj.numberFormatException();
        obj.xAException();
        obj.runtimeException();
        obj.fileSystemException();

    }
}
