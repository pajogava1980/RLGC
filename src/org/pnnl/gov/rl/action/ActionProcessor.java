package org.pnnl.gov.rl.action;

import java.util.Hashtable;
import java.util.List;

public interface ActionProcessor {
	
	/**
	 * Specify the scope (by bus) where actions will be applied
	 * @param actionBusAry
	 */
	public void setActionScopeByBus(String[] actionBusAry);
	
	public String[] getActionScopeByBus();
	
	public void setActionScopeByGenerator(String[] actionScopeAry);
	
	public String[] getActionScopeByGenerator();
	
	public void setActionScopeByBranch(String[] actionScopeAry);
	
	public String[] getActionScopeByBranch();
	
	public void setActionScopeByCutSet(String[] actionScopeAry);
	
	public String[] getActionScopeByCutSet();
	
	public Hashtable<String, List<String>> getActionCutSetTable();
	public void setActionCutSetTable(Hashtable<String, List<String>> cutSetTable);
	
	public void setActionLevels(double[] actionLevels);
	
	public double[] getActionLevels();
	
	/**
	 * Apply the action(s) to the environment
	 * 
	 * @param actionValueAry  -- 
	 * @param actionValueType -- discrete or continuous
	 * @return action values actually applied
	 */
	public double[] applyAction(double[] actionValueAry, String actionValueType, double duration);
	
	/**
	 * Return an array that shows the status of the agent for the actions, for example, the remaining load fractions that could be sheded.
	 * @return
	 */
	public double[] getAgentActionStatus();
	

}
