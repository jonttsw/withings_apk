package com.withings.measure.android.data.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import fr0.c;
import fr0.e;
import fr0.o;
import java.util.List;
import kotlin.Metadata;
import my.a;
import my.b;
import nm0.y;
import qm0.d;
/* compiled from: MeasureRetrofit2Api.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JB\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0098\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010!J:\u0010&\u001a\u00020%2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010'J\u001e\u0010)\u001a\u0004\u0018\u00010\u00012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b)\u0010*Jp\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u00042\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b/\u00100¨\u00061À\u0006\u0003"}, d2 = {"Lcom/withings/measure/android/data/ws/MeasureRetrofit2Api;", "", "", NavigationArguments.USER_ID, "", "lastUpdate", "limit", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "category", "Lmy/c;", "getUserMeasures", "(JIIIILqm0/d;)Ljava/lang/Object;", "devType", "categoryType", "measTimeInSecond", "", "comment", "attrib", "measures", WsVasistasSerie.KEY_ALGO, "getCreatedMeasureGroup", "deviceId", "deviceModelId", "brand", "Lmy/d;", "storeMeasure", "(ILjava/lang/Long;IILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "grpid", "Lnm0/y;", "updateMeasure", "(JJLjava/lang/String;ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "grpId", "deleteMeasure", "(JLqm0/d;)Ljava/lang/Object;", "measTypes", "start", "end", "Lmy/b;", "getHFMeasure", "(JLjava/lang/String;JJLqm0/d;)Ljava/lang/Object;", "measureJson", "storeHFMeasure", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "measuregrps", WsVasistasSerie.KEY_MODEL, "", "Lmy/a;", "batchStore", "(Ljava/lang/String;IILjava/lang/Integer;ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MeasureRetrofit2Api {
    @e
    @o("measure?action=batchstore")
    Object batchStore(@c("measuregrps") String str, @c("category") int i11, @c("devtype") int i12, @c("attribstatus") Integer num, @c("brand") int i13, @c("userid") Long l5, @c("model") Integer num2, @c("getcreatedmeasgrps") Integer num3, d<? super List<a>> dVar) throws WrongStatusException.Checked;

    @e
    @o("measure?action=deletemeasgrp")
    Object deleteMeasure(@c("measgrpid") long j5, d<? super y> dVar) throws WrongStatusException.Checked;

    @e
    @o("v2/measure?action=getmeashf")
    Object getHFMeasure(@c("deviceid") long j5, @c("meastype") String str, @c("startdate") long j11, @c("enddate") long j12, d<? super b> dVar) throws WrongStatusException.Checked;

    @e
    @o("measure?action=getmeas")
    Object getUserMeasures(@c("userid") long j5, @c("lastupdate") int i11, @c("limit") int i12, @c("offset") int i13, @c("category") int i14, d<? super my.c> dVar) throws WrongStatusException.Checked;

    @e
    @o("v2/measure?action=storehf")
    Object storeHFMeasure(@c("measuregrps") String str, d<Object> dVar) throws WrongStatusException.Checked;

    @e
    @o("measure?action=store")
    Object storeMeasure(@c("devtype") int i11, @c("userid") Long l5, @c("category") int i12, @c("meastime") int i13, @c("comment") String str, @c("attribstatus") int i14, @c("measures") String str2, @c("algo") Integer num, @c("getcreatedmeasgrps") Integer num2, @c("deviceid") Long l6, @c("model") Integer num3, @c("brand") Long l11, d<? super my.d> dVar) throws WrongStatusException.Checked;

    @e
    @o("measure?action=updatemeasgrp")
    Object updateMeasure(@c("measgrpid") long j5, @c("userid") long j11, @c("comment") String str, @c("attribstatus") int i11, @c("measures") String str2, d<? super y> dVar) throws WrongStatusException.Checked;
}
