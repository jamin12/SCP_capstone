package kr.mmgg.scp.service;

import java.util.List;

import kr.mmgg.scp.dto.ProjectDetailAllTaskDto;
import kr.mmgg.scp.dto.ProjectDetailMyTaskDto;
import kr.mmgg.scp.entity.Task;

public interface ProjectDetailService {

	public ProjectDetailMyTaskDto myTask(Long userId, Long projectId);

	public List<ProjectDetailAllTaskDto> allTask(Long userId);

}
