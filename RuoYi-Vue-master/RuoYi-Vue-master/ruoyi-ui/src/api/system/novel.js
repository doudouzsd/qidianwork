import request from '@/utils/request'

// 查询小说管理列表
export function listNovel(query) {
  return request({
    url: '/system/novel/list',
    method: 'get',
    params: query
  })
}

// 查询小说管理详细
export function getNovel(novelId) {
  return request({
    url: '/system/novel/' + novelId,
    method: 'get'
  })
}

// 新增小说管理
export function addNovel(data) {
  return request({
    url: '/system/novel',
    method: 'post',
    data: data
  })
}

// 修改小说管理
export function updateNovel(data) {
  return request({
    url: '/system/novel',
    method: 'put',
    data: data
  })
}

// 删除小说管理
export function delNovel(novelId) {
  return request({
    url: '/system/novel/' + novelId,
    method: 'delete'
  })
}
