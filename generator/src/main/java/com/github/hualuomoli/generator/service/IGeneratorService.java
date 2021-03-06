package com.github.hualuomoli.generator.service;

import java.util.List;

import com.github.hualuomoli.generator.entity.Table;

/**
 * generator service
 * query table message and column message
 * Assemble to a Table entity
 * @author hualuomoli
 *
 */
public interface IGeneratorService {

	// find table list
	List<Table> findTableList();

	/**
	 * assemble message to a table Entity
	 * @param tableName table's name
	 * @return table message
	 */
	Table assemble(String tableName);

}
