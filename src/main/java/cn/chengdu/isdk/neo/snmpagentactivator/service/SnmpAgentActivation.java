package cn.chengdu.isdk.neo.snmpagentactivator.service;

import cn.chengdu.isdk.neo.snmpagentactivator.entity.ActivationInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnmpAgentActivation {
    @RequestMapping("/v1/activated_snmp_agents/{agent_id}")
    public ActivationInfo getActivationInfo(@PathVariable("agent_id") String agentId) {
        ActivationInfo activationInfo = new ActivationInfo();
        if (agentId.equals("agent1")) {
            activationInfo.setStatus(true);
        } else {
            activationInfo.setStatus(false);
        }
        return activationInfo;
    }
}
