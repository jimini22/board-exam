package com.mini.portal.board.service;

import com.mini.portal.board.model.PostResponseVO;
import com.mini.portal.board.model.PostSearchVO;
import com.mini.portal.board.model.PostVO;
import com.mini.portal.board.service.impl.List;
import com.mini.portal.board.service.impl.PageInfoVO;
import com.mini.portal.board.service.impl.PageInfoVo;
import com.mini.portal.board.service.impl.PostReceiverVO;
import com.mini.portal.board.service.impl.PostSendVO;

public interface PostService {

	public PostResponseVO selectPostDetail(PostVO vo) throws Exception;
		
	public Long createPost(PostVO vo) throws Exception;
	
	public Long updatePost(PostVO vo) throws Exception;
	
	public void deletePost(PostVO vo) throws Exception;
	
	public void hitPlus(Long id) throws Exception;
	
	public PostVO selectReplyList(PostVO vo) throws Exception;
		
	public void createReply(PostVO vo) throws Exception;
	
	public PostSendVO sendMessageToOrganization(Long organizationId) throws Exception;
	
	public PostSendVO sendMessageToAdmin() throws Exception;
	
	public PostSendVO sendMessageToUser(Long id) throws Exception;
	
	public PostResponseVO selectPostList(PostSearchVO svo) throws Exception;
	
	public PostResponseVO selectNoticeList(PostSearchVO svo) throws Exception;
	
}