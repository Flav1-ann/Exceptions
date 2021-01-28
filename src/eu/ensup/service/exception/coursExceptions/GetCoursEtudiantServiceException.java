package eu.ensup.service.exception.coursExceptions;

import eu.ensup.service.BaseService;

import eu.ensup.service.exception.ServiceException;

public class GetCoursEtudiantServiceException extends ServiceException {
    public GetCoursEtudiantServiceException() {
        super(BaseService.messageExceptionCoursEtudiant);
        BaseService.logger.info(BaseService.messageExceptionCoursGet);
    }
}
