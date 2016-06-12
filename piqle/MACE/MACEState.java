
package MACE; 

/*
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published by
 *    the Free Software Foundation; either version 2.1 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301 USA.
 */

/*
 *    MACEtate.java
 *    Copyright (C) 2004 Francesco De Comit�
 *                  2007 Pedro Colla (pcolla@frsf.utn.edu.ar)
 *
 */

 
import environment.*;



/** Wrapping Interface State and define some common behaviors.

@author Francesco De Comite (decomite at lifl.fr)
 @version $Revision: 1.0 $ 

*/

abstract public class MACEState extends AbstractState{

    private MACEAgent myAgent;    
    public MACEState(IEnvironment ct){
	    super(ct);
	    
    }
        
    public void setAgent(MACEAgent ag) {
	    this.myAgent=ag;
    }

    public MACEAgent getAgent() {
	    return this.myAgent;
    }
}




    
