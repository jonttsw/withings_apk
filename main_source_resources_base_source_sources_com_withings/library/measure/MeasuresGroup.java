package com.withings.library.measure;

import com.withings.library.measure.ws.HFMeasureResponse;
import com.withings.library.measure.ws.MeasureGroupResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import k1.w0;
@Deprecated
/* loaded from: classes4.dex */
public class MeasuresGroup implements Serializable {
    private static final int DEFAULT_MEASURE_LIST_SIZE = 6;
    private static final long serialVersionUID = -3436908756758440832L;
    private int algo;
    private int attrib;
    private long brand;
    private int category;
    private String comment;
    private Date date;
    private Long deviceId;
    private Integer deviceModelId;
    private int devtype;

    /* renamed from: id  reason: collision with root package name */
    private long f40635id;
    private Measure last;
    private List<Measure> measures;
    private long modifiedTime;
    private int synced;
    @Deprecated
    private int type;
    private long userId;
    private long wsId;

    public MeasuresGroup() {
        this(6);
    }

    private int findType() {
        int size;
        List<Measure> list = this.measures;
        if (list == null || (size = list.size()) < 1) {
            return -1;
        }
        for (int i11 = 0; i11 < size; i11++) {
            int type = this.measures.get(i11).getType();
            if (type != 1) {
                if (type != 35) {
                    if (type == 4) {
                        return 4;
                    }
                    if (type != 5 && type != 6) {
                        switch (type) {
                            case 8:
                                break;
                            case 9:
                            case 10:
                            case 11:
                                return 9;
                            case 12:
                                break;
                            default:
                        }
                    }
                }
                return 35;
            }
            if (getMeasureForType(1) != null) {
                return 1;
            }
            return Integer.MIN_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    public void addMeasure(Measure measure) {
        this.measures.add(measure);
    }

    public int getAlgo() {
        return this.algo;
    }

    public List<Integer> getAllMeasuresTypes() {
        ArrayList arrayList = new ArrayList();
        for (Measure measure : this.measures) {
            arrayList.add(Integer.valueOf(measure.getType()));
        }
        return arrayList;
    }

    public Measure getAnyMeasure() {
        List<Measure> list = this.measures;
        if (list != null && list.size() >= 1) {
            return this.measures.get(0);
        }
        return null;
    }

    public int getAttrib() {
        return this.attrib;
    }

    public long getBrand() {
        return this.brand;
    }

    public int getCategory() {
        return this.category;
    }

    public String getComment() {
        return this.comment;
    }

    public Date getDate() {
        return this.date;
    }

    public int getDevType() {
        return this.devtype;
    }

    public Long getDeviceId() {
        return this.deviceId;
    }

    public Integer getDeviceModelId() {
        return this.deviceModelId;
    }

    public long getId() {
        return this.f40635id;
    }

    public Measure getLastMeasure() {
        if (this.measures.isEmpty()) {
            return null;
        }
        return (Measure) w0.a(this.measures, 1);
    }

    public Measure getMeasureAt(int i11) {
        return this.measures.get(i11);
    }

    public int getMeasureCount() {
        List<Measure> list = this.measures;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Measure getMeasureForType(int i11) {
        if (this.measures == null) {
            return null;
        }
        Measure measure = this.last;
        if (measure != null && measure.getType() == i11) {
            return this.last;
        }
        for (Measure measure2 : this.measures) {
            if (measure2.getType() == i11) {
                this.last = measure2;
                return measure2;
            }
        }
        return null;
    }

    public List<Measure> getMeasures() {
        return this.measures;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public int getSynced() {
        return this.synced;
    }

    @Deprecated
    public int getType() {
        if (this.type == Integer.MIN_VALUE) {
            this.type = findType();
        }
        return this.type;
    }

    public long getUserId() {
        return this.userId;
    }

    public long getWsId() {
        return this.wsId;
    }

    public boolean hasMeasureForType(int i11) {
        if (getMeasureForType(i11) != null) {
            return true;
        }
        return false;
    }

    public void set(MeasuresGroup measuresGroup) {
        this.f40635id = measuresGroup.f40635id;
        this.userId = measuresGroup.userId;
        this.measures = measuresGroup.measures;
        this.attrib = measuresGroup.attrib;
        this.date = measuresGroup.date;
        this.category = measuresGroup.category;
        this.type = measuresGroup.type;
        this.brand = measuresGroup.brand;
    }

    public void setAlgo(int i11) {
        this.algo = i11;
    }

    public void setAttrib(int i11) {
        this.attrib = i11;
    }

    public void setBrand(long j5) {
        this.brand = j5;
    }

    public void setCategory(int i11) {
        this.category = i11;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDeviceId(Long l5) {
        this.deviceId = l5;
    }

    public void setDeviceModelId(Integer num) {
        this.deviceModelId = num;
    }

    public void setDevtype(int i11) {
        this.devtype = i11;
    }

    public void setId(long j5) {
        this.f40635id = j5;
    }

    public void setModifiedTime(long j5) {
        this.modifiedTime = j5;
    }

    public void setSynced(int i11) {
        this.synced = i11;
    }

    @Deprecated
    public void setType(int i11) {
        this.type = i11;
    }

    public void setUserId(long j5) {
        this.userId = j5;
    }

    public void setWsId(long j5) {
        this.wsId = j5;
    }

    public String toString() {
        return "MeasuresGroup{id=" + this.f40635id + ", userId=" + this.userId + ", measures=" + this.measures + ", attrib=" + this.attrib + ", date=" + this.date + ", category=" + this.category + ", devtype=" + this.devtype + ", deviceId=" + this.deviceId + ", deviceModelId=" + this.deviceModelId + ", comment='" + this.comment + "', last=" + this.last + ", brand=" + this.brand + '}';
    }

    public MeasuresGroup(int i11) {
        this.algo = 0;
        this.brand = 1L;
        this.f40635id = -1L;
        this.wsId = -1L;
        this.userId = -1L;
        this.measures = new ArrayList(i11);
        this.attrib = 1;
        this.date = null;
        this.category = -1;
        this.type = Integer.MIN_VALUE;
    }

    @Deprecated
    /* renamed from: clone */
    public MeasuresGroup m30clone() {
        MeasuresGroup measuresGroup = new MeasuresGroup(0);
        measuresGroup.f40635id = this.f40635id;
        measuresGroup.userId = this.userId;
        measuresGroup.measures = this.measures;
        measuresGroup.attrib = this.attrib;
        measuresGroup.date = this.date;
        measuresGroup.category = this.category;
        measuresGroup.type = this.type;
        measuresGroup.comment = this.comment;
        measuresGroup.deviceId = this.deviceId;
        measuresGroup.deviceModelId = this.deviceModelId;
        measuresGroup.brand = this.brand;
        return measuresGroup;
    }

    public MeasuresGroup(MeasureGroupResponse.WsMeasureGroup wsMeasureGroup) {
        this.algo = 0;
        this.brand = 1L;
        this.f40635id = -1L;
        this.wsId = wsMeasureGroup.grpid;
        this.userId = -1L;
        this.attrib = wsMeasureGroup.attrib;
        this.date = new Date(wsMeasureGroup.date);
        this.category = wsMeasureGroup.category;
        this.type = Integer.MIN_VALUE;
        this.comment = wsMeasureGroup.comment;
        this.modifiedTime = wsMeasureGroup.modified * 1000;
        this.measures = new ArrayList(wsMeasureGroup.measures.length);
        for (MeasureGroupResponse.WsMeasure wsMeasure : wsMeasureGroup.measures) {
            Measure measure = new Measure(wsMeasure);
            measure.setGroup(this);
            measure.setDate(this.date);
            this.measures.add(measure);
        }
        this.deviceId = Long.valueOf(wsMeasureGroup.deviceid);
        this.brand = wsMeasureGroup.brand;
    }

    public MeasuresGroup(HFMeasureResponse.WsHfMeasure wsHfMeasure) {
        this(1);
        setDate(new Date(wsHfMeasure.date * 1000));
        Measure measure = new Measure();
        measure.setDate(getDate());
        measure.setType(wsHfMeasure.type);
        measure.setValue(wsHfMeasure.value);
        measure.setUnit(0);
        addMeasure(measure);
        measure.setGroup(this);
    }
}
