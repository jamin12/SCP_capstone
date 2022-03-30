package kr.mmgg.scp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import kr.mmgg.scp.dto.ProjectDetailAllTaskDto;
import kr.mmgg.scp.dto.ProjectDetailMyTaskDto;
import kr.mmgg.scp.dto.ProjectDetailReceiveTaskDto;
import kr.mmgg.scp.dto.ProjectDetailRequestTaskDto;
import kr.mmgg.scp.dto.ProjectDetailSendTaskDto;
import kr.mmgg.scp.entity.Task;

public interface ProjectDetailService {

	public ProjectDetailMyTaskDto myTask(Long userId, Long projectId);

	public List<ProjectDetailAllTaskDto> allTask(Long userId);
	
	public List<ProjectDetailReceiveTaskDto> receiveTask(Long projectId, Long projectinuserID);
	
	public ProjectDetailRequestTaskDto requestTask();
	
	public boolean sendTask(ProjectDetailSendTaskDto dto);
}
