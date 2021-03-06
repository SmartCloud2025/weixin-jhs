package cc.pp.weixin.biz.jhs.ao;

import org.dom4j.Element;

/**
 * 聚划算业务处理类，
 * 用于业务处理
 * @author wgybzb
 * @since  2013-05-28
 *
 */
public interface JuBusinessAO {

	/**
	 * 获取微信格式的响应内容给用户
	 * @param 	rootElement
	 * 			用户的请求数据，来自微信平台，格式为xml
	 * @return
	 * 			微信格式的响应内容
	 */
	String getWeixinMsg(Element rootElement);
}
