package com.microservices.mapper;

import com.microservices.dto.TaskDTO;
import com.microservices.entity.Task;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public TaskDTO mapToDTO(Task entity) {
        if ( entity == null ) {
            return null;
        }

        TaskDTO.TaskDTOBuilder taskDTO = TaskDTO.builder();

        taskDTO.id( entity.getId() );
        taskDTO.userEmail( entity.getUserEmail() );
        taskDTO.title( entity.getTitle() );
        taskDTO.description( entity.getDescription() );
        taskDTO.category( entity.getCategory() );
        taskDTO.dueDate( entity.getDueDate() );
        taskDTO.status( entity.getStatus() );

        return taskDTO.build();
    }

    @Override
    public Task mapToEntity(TaskDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Task.TaskBuilder task = Task.builder();

        task.id( dto.getId() );
        task.userEmail( dto.getUserEmail() );
        task.title( dto.getTitle() );
        task.description( dto.getDescription() );
        task.category( dto.getCategory() );
        task.status( dto.getStatus() );
        task.dueDate( dto.getDueDate() );

        return task.build();
    }
}
