/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.cms.core.entity.DocumentViewRecord.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Thu Dec 27 11:40:05 CST 2018")
public class DocumentViewRecord_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<DocumentViewRecord,String> appId;
    public static volatile SingularAttribute<DocumentViewRecord,String> appName;
    public static volatile SingularAttribute<DocumentViewRecord,String> categoryId;
    public static volatile SingularAttribute<DocumentViewRecord,String> categoryName;
    public static volatile SingularAttribute<DocumentViewRecord,String> documentId;
    public static volatile SingularAttribute<DocumentViewRecord,String> id;
    public static volatile SingularAttribute<DocumentViewRecord,Date> lastViewTime;
    public static volatile SingularAttribute<DocumentViewRecord,String> title;
    public static volatile SingularAttribute<DocumentViewRecord,Integer> viewCount;
    public static volatile SingularAttribute<DocumentViewRecord,String> viewerName;
    public static volatile SingularAttribute<DocumentViewRecord,String> viewerTopUnitName;
    public static volatile SingularAttribute<DocumentViewRecord,String> viewerUnitName;
}
