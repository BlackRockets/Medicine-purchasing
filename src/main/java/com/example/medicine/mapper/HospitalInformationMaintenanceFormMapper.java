package com.example.medicine.mapper;

import com.example.medicine.bean.HospitalInformationMaintenanceForm;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 医院信息(HospitalInformationMaintenanceForm)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-26 15:35:36
 */
public interface HospitalInformationMaintenanceFormMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param maintenanceTableId 主键
     * @return 实例对象
     */
    HospitalInformationMaintenanceForm queryById(Integer maintenanceTableId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<HospitalInformationMaintenanceForm> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param hospitalInformationMaintenanceForm 实例对象
     * @return 对象列表
     */
    List<HospitalInformationMaintenanceForm> queryAll(HospitalInformationMaintenanceForm hospitalInformationMaintenanceForm);

    /**
     * 新增数据
     *
     * @param hospitalInformationMaintenanceForm 实例对象
     * @return 影响行数
     */
    int insert(HospitalInformationMaintenanceForm hospitalInformationMaintenanceForm);

    /**
     * 修改数据
     *
     * @param hospitalInformationMaintenanceForm 实例对象
     * @return 影响行数
     */
    int update(HospitalInformationMaintenanceForm hospitalInformationMaintenanceForm);

    /**
     * 通过主键删除数据
     *
     * @param maintenanceTableId 主键
     * @return 影响行数
     */
    int deleteById(Integer maintenanceTableId);

    int addA(Integer maintenanceTableId, String nameOfHospital);

}