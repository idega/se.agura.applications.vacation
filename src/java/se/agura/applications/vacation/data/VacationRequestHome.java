/*
 * $Id: VacationRequestHome.java,v 1.2 2004/12/09 13:43:37 laddi Exp $
 * Created on 7.12.2004
 *
 * Copyright (C) 2004 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package se.agura.applications.vacation.data;


import com.idega.data.IDOHome;


/**
 * Last modified: $Date: 2004/12/09 13:43:37 $ by $Author: laddi $
 * 
 * @author <a href="mailto:laddi@idega.com">laddi</a>
 * @version $Revision: 1.2 $
 */
public interface VacationRequestHome extends IDOHome {

	public VacationRequest create() throws javax.ejb.CreateException;

	public VacationRequest findByPrimaryKey(Object pk) throws javax.ejb.FinderException;

}
