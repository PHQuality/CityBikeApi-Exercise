package pojo;
import java.util.List;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonFormat;

public class Network

{

private List<String> company;
private String href;
private String id;
private Location location;
private String name;
private String source;
private String gbfs_href;
private License license;


@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
public List<String> getCompany() {
return company;
}

@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
public void setCompany(List<String> company) {
this.company = company;
}

public String getgbfs_href() {
return gbfs_href;
}

public void setgbfs_href(String gbfs_href) {
this.gbfs_href = gbfs_href;
}

public String getHref() {
return href;
}

public void setHref(String href) {
this.href = href;
}

public License getLicense() {
return license;
}

public void setLicense(License license) {
this.license = license;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}



public Location getLocation() {
return location;
}

public void setLocation(Location location) {
this.location = location;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getSource(String source) {
return source;
}

public void setSource(String source) {
this.source = source;
}


}
