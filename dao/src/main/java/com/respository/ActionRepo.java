package com.respository;

import com.domain.Action;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * ActionRepo
 *
 * @author zf
 * @date 2017/10/31
 */
public interface ActionRepo extends PagingAndSortingRepository<Action, Integer>{
}
