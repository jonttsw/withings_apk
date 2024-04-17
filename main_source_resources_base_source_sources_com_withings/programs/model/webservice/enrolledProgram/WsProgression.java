package com.withings.programs.model.webservice.enrolledProgram;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.h2;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsProgression.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002LKBo\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bE\u0010FBw\b\u0011\u0012\u0006\u0010G\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bE\u0010JJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J~\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u0010J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0004J\u001a\u0010&\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J(\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÁ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b2\u0010\u0004R\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u00106R$\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u00107\u001a\u0004\b8\u0010\t\"\u0004\b9\u0010:R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010\rR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010=\u001a\u0004\b>\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010=\u001a\u0004\b?\u0010\u0010R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010@\u001a\u0004\bA\u0010\u0013R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010B\u001a\u0004\bC\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010=\u001a\u0004\bD\u0010\u0010¨\u0006M"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "", "", "component1", "()I", "", "component2", "()J", "component3", "()Ljava/lang/Long;", "", "Lcom/withings/programs/model/webservice/enrolledProgram/WsMenu;", "component4", "()Ljava/util/List;", "", "component5", "()Ljava/lang/String;", "component6", "component7", "()Ljava/lang/Integer;", "", "component8", "()Ljava/lang/Boolean;", "component9", "status", "start", "end", "menu", "summary", "fullSummary", "progress", "unread", "programSwToken", "copy", "(IJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getStatus", "J", "getStart", "setStart", "(J)V", "Ljava/lang/Long;", "getEnd", "setEnd", "(Ljava/lang/Long;)V", "Ljava/util/List;", "getMenu", "Ljava/lang/String;", "getSummary", "getFullSummary", "Ljava/lang/Integer;", "getProgress", "Ljava/lang/Boolean;", "getUnread", "getProgramSwToken", "<init>", "(IJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsProgression {
    @SerializedName("end")
    private Long end;
    @SerializedName("full_summary")
    private final String fullSummary;
    @SerializedName("menu")
    private final List<WsMenu> menu;
    @SerializedName("program_sw_token")
    private final String programSwToken;
    @SerializedName("progress")
    private final Integer progress;
    @SerializedName("start")
    private long start;
    @SerializedName("status")
    private final int status;
    @SerializedName("summary")
    private final String summary;
    @SerializedName("unread")
    private final Boolean unread;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(WsMenu$$serializer.INSTANCE), null, null, null, null, null};

    /* compiled from: WsProgression.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsProgression;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsProgression> serializer() {
            return WsProgression$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsProgression(int i11, int i12, long j5, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, WsProgression$$serializer.INSTANCE.getDescriptor());
        }
        this.status = i12;
        this.start = j5;
        this.end = l5;
        if ((i11 & 8) == 0) {
            this.menu = null;
        } else {
            this.menu = list;
        }
        if ((i11 & 16) == 0) {
            this.summary = null;
        } else {
            this.summary = str;
        }
        if ((i11 & 32) == 0) {
            this.fullSummary = null;
        } else {
            this.fullSummary = str2;
        }
        if ((i11 & 64) == 0) {
            this.progress = null;
        } else {
            this.progress = num;
        }
        if ((i11 & 128) == 0) {
            this.unread = null;
        } else {
            this.unread = bool;
        }
        if ((i11 & 256) == 0) {
            this.programSwToken = null;
        } else {
            this.programSwToken = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsProgression copy$default(WsProgression wsProgression, int i11, long j5, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, int i12, Object obj) {
        int i13;
        long j11;
        Long l6;
        List<WsMenu> list2;
        String str4;
        String str5;
        Integer num2;
        Boolean bool2;
        String str6;
        if ((i12 & 1) != 0) {
            i13 = wsProgression.status;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            j11 = wsProgression.start;
        } else {
            j11 = j5;
        }
        if ((i12 & 4) != 0) {
            l6 = wsProgression.end;
        } else {
            l6 = l5;
        }
        if ((i12 & 8) != 0) {
            list2 = wsProgression.menu;
        } else {
            list2 = list;
        }
        if ((i12 & 16) != 0) {
            str4 = wsProgression.summary;
        } else {
            str4 = str;
        }
        if ((i12 & 32) != 0) {
            str5 = wsProgression.fullSummary;
        } else {
            str5 = str2;
        }
        if ((i12 & 64) != 0) {
            num2 = wsProgression.progress;
        } else {
            num2 = num;
        }
        if ((i12 & 128) != 0) {
            bool2 = wsProgression.unread;
        } else {
            bool2 = bool;
        }
        if ((i12 & 256) != 0) {
            str6 = wsProgression.programSwToken;
        } else {
            str6 = str3;
        }
        return wsProgression.copy(i13, j11, l6, list2, str4, str5, num2, bool2, str6);
    }

    public static final /* synthetic */ void write$Self$android_release(WsProgression wsProgression, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, wsProgression.status);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, wsProgression.start);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, wsProgression.end);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || wsProgression.menu != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], wsProgression.menu);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || wsProgression.summary != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, wsProgression.summary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || wsProgression.fullSummary != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, wsProgression.fullSummary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || wsProgression.progress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, wsProgression.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || wsProgression.unread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, wsProgression.unread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || wsProgression.programSwToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, wsProgression.programSwToken);
        }
    }

    public final int component1() {
        return this.status;
    }

    public final long component2() {
        return this.start;
    }

    public final Long component3() {
        return this.end;
    }

    public final List<WsMenu> component4() {
        return this.menu;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.fullSummary;
    }

    public final Integer component7() {
        return this.progress;
    }

    public final Boolean component8() {
        return this.unread;
    }

    public final String component9() {
        return this.programSwToken;
    }

    public final WsProgression copy(int i11, long j5, Long l5, List<WsMenu> list, String str, String str2, Integer num, Boolean bool, String str3) {
        return new WsProgression(i11, j5, l5, list, str, str2, num, bool, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsProgression)) {
            return false;
        }
        WsProgression wsProgression = (WsProgression) obj;
        if (this.status == wsProgression.status && this.start == wsProgression.start && u.e(this.end, wsProgression.end) && u.e(this.menu, wsProgression.menu) && u.e(this.summary, wsProgression.summary) && u.e(this.fullSummary, wsProgression.fullSummary) && u.e(this.progress, wsProgression.progress) && u.e(this.unread, wsProgression.unread) && u.e(this.programSwToken, wsProgression.programSwToken)) {
            return true;
        }
        return false;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final String getFullSummary() {
        return this.fullSummary;
    }

    public final List<WsMenu> getMenu() {
        return this.menu;
    }

    public final String getProgramSwToken() {
        return this.programSwToken;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final Boolean getUnread() {
        return this.unread;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int a11 = c.a(this.start, Integer.hashCode(this.status) * 31, 31);
        Long l5 = this.end;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        List<WsMenu> list = this.menu;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.summary;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.fullSummary;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Integer num = this.progress;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Boolean bool = this.unread;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str3 = this.programSwToken;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i17 + i11;
    }

    public final void setEnd(Long l5) {
        this.end = l5;
    }

    public final void setStart(long j5) {
        this.start = j5;
    }

    public String toString() {
        int i11 = this.status;
        long j5 = this.start;
        Long l5 = this.end;
        List<WsMenu> list = this.menu;
        String str = this.summary;
        String str2 = this.fullSummary;
        Integer num = this.progress;
        Boolean bool = this.unread;
        String str3 = this.programSwToken;
        StringBuilder sb2 = new StringBuilder("WsProgression(status=");
        sb2.append(i11);
        sb2.append(", start=");
        sb2.append(j5);
        sb2.append(", end=");
        sb2.append(l5);
        sb2.append(", menu=");
        sb2.append(list);
        b.d(sb2, ", summary=", str, ", fullSummary=", str2);
        sb2.append(", progress=");
        sb2.append(num);
        sb2.append(", unread=");
        sb2.append(bool);
        return h2.c(sb2, ", programSwToken=", str3, ")");
    }

    public WsProgression(int i11, long j5, Long l5, List<WsMenu> list, String str, String str2, Integer num, Boolean bool, String str3) {
        this.status = i11;
        this.start = j5;
        this.end = l5;
        this.menu = list;
        this.summary = str;
        this.fullSummary = str2;
        this.progress = num;
        this.unread = bool;
        this.programSwToken = str3;
    }

    public /* synthetic */ WsProgression(int i11, long j5, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, int i12, m mVar) {
        this(i11, j5, l5, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : bool, (i12 & 256) != 0 ? null : str3);
    }
}
