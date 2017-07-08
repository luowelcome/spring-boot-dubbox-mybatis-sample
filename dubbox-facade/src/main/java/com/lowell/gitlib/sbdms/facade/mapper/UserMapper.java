package com.lowell.gitlib.sbdms.facade.mapper;




import com.lowell.gitlib.sbdms.model.UserInfoResponse;
import com.lowell.gitlib.sbdms.model.UserInfoRequest;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xiabin on 2017/6/17.
 */
@Mapper
public interface UserMapper {

    UserInfoResponse getUserInfo(UserInfoRequest request);
}
