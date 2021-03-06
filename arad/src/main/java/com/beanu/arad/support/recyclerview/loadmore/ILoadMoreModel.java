package com.beanu.arad.support.recyclerview.loadmore;

import com.beanu.arad.base.BaseModel;
import com.beanu.arad.http.IPageModel;

import java.util.Map;

import rx.Observable;

/**
 * LoadMore M层
 * Created by lizhihua on 2016/12/14.
 */

public interface ILoadMoreModel<B> extends BaseModel {
    Observable<IPageModel<B>> loadData(Map<String, Object> params, int pageIndex);
}
