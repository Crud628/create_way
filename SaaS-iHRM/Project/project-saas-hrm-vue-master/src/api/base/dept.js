import {createAPI} from '@/utils/request'

//查询部门列表的API
export const list = data => createAPI('/company/department', 'get', data)
//保存部门
export const save = data => createAPI('/company/department', 'post', data)
//根据id查询部门
export const find = data => createAPI(`/company/department/${data.id}`, 'get', data)
//根据id删除部门
export const deleteById = data => createAPI(`/company/department/${data.id}`, 'delete', data)
//根据id更新部门
export const update = data => createAPI(`/company/department/${data.id}`, 'put', data)
//保存或更新
export const saveOrUpdate = data =>{return data.id?update(data):save(data)}