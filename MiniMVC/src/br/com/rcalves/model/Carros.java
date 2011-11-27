/**
 *    This program is a miniMVC.
 *    Copyright (C) 2011  RCAlves
 * 
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 * 
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 * 
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.rcalves.model;

import java.util.ArrayList;
import java.util.List;

public class Carros {
	private List<String> carros;
	
	public Carros(){
		carros = new ArrayList<String>();
	}

	public List<String> getCarros( String tipo ) {
		
		if(tipo.equals("nacional")){
			carros.add("Chevrolet");
			carros.add("Fiat");
			carros.add("VW");
		}
		else {
			carros.add("Ferrari");
			carros.add("Lamborghini");
			carros.add("BMW");
		}
		
		return carros;
	}
}
