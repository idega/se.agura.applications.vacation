/*
 * $Id: VacationBusinessHome.java,v 1.3 2004/12/09 13:43:37 laddi Exp $
 * Created on 9.12.2004
 *
 * Copyright (C) 2004 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package se.agura.applications.vacation.business;




import com.idega.business.IBOHome;


/**
 * Last modified: $Date: 2004/12/09 13:43:37 $ by $Author: laddi $
 * 
 * @author <a href="mailto:laddi@idega.com">laddi</a>
 * @version $Revision: 1.3 $
 */
public interface VacationBusinessHome extends IBOHome {

	public VacationBusiness create() throws javax.ejb.CreateException, java.rmi.RemoteException;

}
