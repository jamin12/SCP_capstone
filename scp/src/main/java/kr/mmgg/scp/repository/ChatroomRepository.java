package kr.mmgg.scp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.mmgg.scp.entity.Chatroom;

@Repository
public interface ChatroomRepository extends JpaRepository<Chatroom, Long>{

}