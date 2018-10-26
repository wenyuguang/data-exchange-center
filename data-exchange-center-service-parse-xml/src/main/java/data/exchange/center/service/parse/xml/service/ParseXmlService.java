package data.exchange.center.service.parse.xml.service;

import java.util.Map;

import data.exchange.center.service.parse.xml.domain.XmlContent;

/**
 * <p>Title: GetXmlService.java</p>
 * <p>Description: </p>
 * <p>Copyright:Copyright(c) 2017</p>
 * <p>Company: pelox </p>
 * <p>CreateTime:2017年2月27日 下午8:22:37</p>
 * @author Wen.Yuguang
 * @version 1.0
 **/
public interface ParseXmlService {

    /**
     * 
     * @function get xml content from db
     * @author wenyuguang
     * @param map 
     * @creaetime 2017年2月27日 下午8:24:10
     * @return
     * @throws Exception
     */
    public XmlContent getXML(Map<String, Object> map) throws Exception;
    
    /**
     * 
     * @function 
     * @author wenyuguang
     * @param param 
     * @creaetime 2017年3月2日 下午11:14:12
     * @return
     * @throws Exception
     */
    public int saveCase(String sql, Map<String, Object> param) throws Exception;

    /**
     * @function 
     * @author wenyuguang
     * @creaetime 2017年3月7日 上午11:49:45
     * @param deleteSql
     * @return
     */
    public int deleteTableRecord(String deleteSql) throws Exception;
}
