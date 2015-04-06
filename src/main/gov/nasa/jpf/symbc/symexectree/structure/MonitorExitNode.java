/*
 * Copyright (C) 2014, United States Government, as represented by the
 * Administrator of the National Aeronautics and Space Administration.
 * All rights reserved.
 *
 * Symbolic Pathfinder (jpf-symbc) is licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0. 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */

/**
 * 
 */
package gov.nasa.jpf.symbc.symexectree.structure;

import gov.nasa.jpf.jvm.bytecode.MONITOREXIT;
import gov.nasa.jpf.symbc.symexectree.InstrContext;

/**
 * @author Kasper S. Luckow <luckow@cs.aau.dk>
 *
 */
public class MonitorExitNode extends MonitorNode {

	public MonitorExitNode(InstrContext instructionContext) {
		this(instructionContext, null);
	}
	
	public MonitorExitNode(InstrContext instructionContext, SymbolicExecutionTree tree) {
		super(instructionContext, tree);
		
		if(!(instructionContext.getInstr() instanceof MONITOREXIT))
			throw new UnexpectedInstructionTypeException(instructionContext.getInstr().getClass(), MONITOREXIT.class);
	}

}
