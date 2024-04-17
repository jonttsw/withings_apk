package com.withings.programs.model.webservice.wellnessPrograms;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import androidx.camera.core.y1;
import androidx.compose.material.v;
import androidx.compose.material3.d;
import androidx.work.impl.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import okhttp3.internal.http2.Http2;
/* compiled from: WsWellnessProgram.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002baB\u009d\u0001\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\u000e\u0012\b\u0010+\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u00101\u001a\u00020\u000e\u0012\b\b\u0002\u00102\u001a\u00020\u0002¢\u0006\u0004\b[\u0010\\B©\u0001\b\u0011\u0012\u0006\u0010]\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\u000e\u0012\b\u0010+\u001a\u0004\u0018\u00010\n\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c\u0012\b\u00100\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u00101\u001a\u00020\u000e\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u0010_\u001a\u0004\u0018\u00010^¢\u0006\u0004\b[\u0010`J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010\u0010J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0004J¸\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010*\u001a\u00020\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b5\u0010\u0007J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u0004J\u001a\u00108\u001a\u00020\u000e2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109J(\u0010B\u001a\u00020?2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=HÁ\u0001¢\u0006\u0004\b@\u0010AR\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010C\u001a\u0004\bD\u0010\u0004R\u001a\u0010%\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\bF\u0010\u0007R\u001a\u0010&\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010C\u001a\u0004\bG\u0010\u0004R\u001a\u0010'\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010E\u001a\u0004\bH\u0010\u0007R\u001a\u0010(\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010I\u001a\u0004\bJ\u0010\fR\u001a\u0010)\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010I\u001a\u0004\bK\u0010\fR\u001a\u0010*\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010L\u001a\u0004\bM\u0010\u0010R\u001c\u0010+\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010N\u001a\u0004\bO\u0010\u0012R\u001c\u0010,\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010P\u001a\u0004\bQ\u0010\u0015R\u001c\u0010-\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010R\u001a\u0004\bS\u0010\u0018R\u001c\u0010.\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010T\u001a\u0004\bU\u0010\u001bR\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010V\u001a\u0004\bW\u0010\u001eR\u001c\u00100\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010X\u001a\u0004\bY\u0010!R\u001a\u00101\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010L\u001a\u0004\b1\u0010\u0010R\u001a\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010C\u001a\u0004\bZ\u0010\u0004¨\u0006c"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;", "", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "component4", "", "component5", "()J", "component6", "", "component7", "()Z", "component8", "()Ljava/lang/Long;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "component9", "()Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsDurationJson;", "component10", "()Lcom/withings/programs/model/webservice/wellnessPrograms/WsDurationJson;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;", "component11", "()Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;", "", "component12", "()Ljava/util/List;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;", "component13", "()Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;", "component14", "component15", NavigationArguments.PROGRAM_ID, "deployment", "targetType", "targetValue", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "visible", "familyid", "specifics", "durationJson", "eligibility", "countryCodes", "data", "isSuggested", "accessLevel", "copy", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;Lcom/withings/programs/model/webservice/wellnessPrograms/WsDurationJson;Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;Ljava/util/List;Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;ZI)Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getProgramId", "Ljava/lang/String;", "getDeployment", "getTargetType", "getTargetValue", "J", "getCreated", "getModified", "Z", "getVisible", "Ljava/lang/Long;", "getFamilyid", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "getSpecifics", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsDurationJson;", "getDurationJson", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;", "getEligibility", "Ljava/util/List;", "getCountryCodes", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;", "getData", "getAccessLevel", "<init>", "(ILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;Lcom/withings/programs/model/webservice/wellnessPrograms/WsDurationJson;Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;Ljava/util/List;Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;ZI)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;ILjava/lang/String;JJZLjava/lang/Long;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;Lcom/withings/programs/model/webservice/wellnessPrograms/WsDurationJson;Lcom/withings/programs/model/webservice/wellnessPrograms/WsEligibility;Ljava/util/List;Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;ZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsWellnessProgram {
    @SerializedName("access_level")
    private final int accessLevel;
    @SerializedName("country_codes")
    private final List<String> countryCodes;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final long created;
    @SerializedName("data")
    private final WsData data;
    @SerializedName("deployment")
    private final String deployment;
    @SerializedName("duration_json")
    private final WsDurationJson durationJson;
    @SerializedName("eligibility")
    private final WsEligibility eligibility;
    @SerializedName("familyid")
    private final Long familyid;
    @SerializedName("is_suggested")
    private final boolean isSuggested;
    @SerializedName("modified")
    private final long modified;
    @SerializedName("programid")
    private final int programId;
    @SerializedName("specifics")
    private final WsSpecifics specifics;
    @SerializedName("target_type")
    private final int targetType;
    @SerializedName("target_value")
    private final String targetValue;
    @SerializedName("visible")
    private final boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null};

    /* compiled from: WsWellnessProgram.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsWellnessProgram;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsWellnessProgram> serializer() {
            return WsWellnessProgram$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsWellnessProgram(int i11, int i12, String str, int i13, String str2, long j5, long j11, boolean z5, Long l5, WsSpecifics wsSpecifics, WsDurationJson wsDurationJson, WsEligibility wsEligibility, List list, WsData wsData, boolean z11, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (8447 != (i11 & 8447)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 8447, WsWellnessProgram$$serializer.INSTANCE.getDescriptor());
        }
        this.programId = i12;
        this.deployment = str;
        this.targetType = i13;
        this.targetValue = str2;
        this.created = j5;
        this.modified = j11;
        this.visible = z5;
        this.familyid = l5;
        if ((i11 & 256) == 0) {
            this.specifics = null;
        } else {
            this.specifics = wsSpecifics;
        }
        if ((i11 & 512) == 0) {
            this.durationJson = null;
        } else {
            this.durationJson = wsDurationJson;
        }
        if ((i11 & 1024) == 0) {
            this.eligibility = null;
        } else {
            this.eligibility = wsEligibility;
        }
        if ((i11 & ModuleCopy.f28574b) == 0) {
            this.countryCodes = null;
        } else {
            this.countryCodes = list;
        }
        if ((i11 & 4096) == 0) {
            this.data = null;
        } else {
            this.data = wsData;
        }
        this.isSuggested = z11;
        this.accessLevel = (i11 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? 0 : i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsWellnessProgram copy$default(WsWellnessProgram wsWellnessProgram, int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, WsSpecifics wsSpecifics, WsDurationJson wsDurationJson, WsEligibility wsEligibility, List list, WsData wsData, boolean z11, int i13, int i14, Object obj) {
        int i15;
        String str3;
        int i16;
        String str4;
        long j12;
        long j13;
        boolean z12;
        Long l6;
        WsSpecifics wsSpecifics2;
        WsDurationJson wsDurationJson2;
        WsEligibility wsEligibility2;
        List<String> list2;
        WsData wsData2;
        boolean z13;
        int i17;
        if ((i14 & 1) != 0) {
            i15 = wsWellnessProgram.programId;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            str3 = wsWellnessProgram.deployment;
        } else {
            str3 = str;
        }
        if ((i14 & 4) != 0) {
            i16 = wsWellnessProgram.targetType;
        } else {
            i16 = i12;
        }
        if ((i14 & 8) != 0) {
            str4 = wsWellnessProgram.targetValue;
        } else {
            str4 = str2;
        }
        if ((i14 & 16) != 0) {
            j12 = wsWellnessProgram.created;
        } else {
            j12 = j5;
        }
        if ((i14 & 32) != 0) {
            j13 = wsWellnessProgram.modified;
        } else {
            j13 = j11;
        }
        if ((i14 & 64) != 0) {
            z12 = wsWellnessProgram.visible;
        } else {
            z12 = z5;
        }
        if ((i14 & 128) != 0) {
            l6 = wsWellnessProgram.familyid;
        } else {
            l6 = l5;
        }
        if ((i14 & 256) != 0) {
            wsSpecifics2 = wsWellnessProgram.specifics;
        } else {
            wsSpecifics2 = wsSpecifics;
        }
        if ((i14 & 512) != 0) {
            wsDurationJson2 = wsWellnessProgram.durationJson;
        } else {
            wsDurationJson2 = wsDurationJson;
        }
        if ((i14 & 1024) != 0) {
            wsEligibility2 = wsWellnessProgram.eligibility;
        } else {
            wsEligibility2 = wsEligibility;
        }
        if ((i14 & ModuleCopy.f28574b) != 0) {
            list2 = wsWellnessProgram.countryCodes;
        } else {
            list2 = list;
        }
        List<String> list3 = list2;
        if ((i14 & 4096) != 0) {
            wsData2 = wsWellnessProgram.data;
        } else {
            wsData2 = wsData;
        }
        WsData wsData3 = wsData2;
        if ((i14 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            z13 = wsWellnessProgram.isSuggested;
        } else {
            z13 = z11;
        }
        if ((i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i17 = wsWellnessProgram.accessLevel;
        } else {
            i17 = i13;
        }
        return wsWellnessProgram.copy(i15, str3, i16, str4, j12, j13, z12, l6, wsSpecifics2, wsDurationJson2, wsEligibility2, list3, wsData3, z13, i17);
    }

    public static final /* synthetic */ void write$Self$android_release(WsWellnessProgram wsWellnessProgram, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, wsWellnessProgram.programId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsWellnessProgram.deployment);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, wsWellnessProgram.targetType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, wsWellnessProgram.targetValue);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, wsWellnessProgram.created);
        compositeEncoder.encodeLongElement(serialDescriptor, 5, wsWellnessProgram.modified);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, wsWellnessProgram.visible);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, wsWellnessProgram.familyid);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || wsWellnessProgram.specifics != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, WsSpecifics$$serializer.INSTANCE, wsWellnessProgram.specifics);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || wsWellnessProgram.durationJson != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, WsDurationJson$$serializer.INSTANCE, wsWellnessProgram.durationJson);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || wsWellnessProgram.eligibility != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, WsEligibility$$serializer.INSTANCE, wsWellnessProgram.eligibility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || wsWellnessProgram.countryCodes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], wsWellnessProgram.countryCodes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || wsWellnessProgram.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, WsData$$serializer.INSTANCE, wsWellnessProgram.data);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 13, wsWellnessProgram.isSuggested);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || wsWellnessProgram.accessLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, wsWellnessProgram.accessLevel);
        }
    }

    public final int component1() {
        return this.programId;
    }

    public final WsDurationJson component10() {
        return this.durationJson;
    }

    public final WsEligibility component11() {
        return this.eligibility;
    }

    public final List<String> component12() {
        return this.countryCodes;
    }

    public final WsData component13() {
        return this.data;
    }

    public final boolean component14() {
        return this.isSuggested;
    }

    public final int component15() {
        return this.accessLevel;
    }

    public final String component2() {
        return this.deployment;
    }

    public final int component3() {
        return this.targetType;
    }

    public final String component4() {
        return this.targetValue;
    }

    public final long component5() {
        return this.created;
    }

    public final long component6() {
        return this.modified;
    }

    public final boolean component7() {
        return this.visible;
    }

    public final Long component8() {
        return this.familyid;
    }

    public final WsSpecifics component9() {
        return this.specifics;
    }

    public final WsWellnessProgram copy(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, WsSpecifics wsSpecifics, WsDurationJson wsDurationJson, WsEligibility wsEligibility, List<String> list, WsData wsData, boolean z11, int i13) {
        u.j(deployment, "deployment");
        u.j(targetValue, "targetValue");
        return new WsWellnessProgram(i11, deployment, i12, targetValue, j5, j11, z5, l5, wsSpecifics, wsDurationJson, wsEligibility, list, wsData, z11, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsWellnessProgram)) {
            return false;
        }
        WsWellnessProgram wsWellnessProgram = (WsWellnessProgram) obj;
        if (this.programId == wsWellnessProgram.programId && u.e(this.deployment, wsWellnessProgram.deployment) && this.targetType == wsWellnessProgram.targetType && u.e(this.targetValue, wsWellnessProgram.targetValue) && this.created == wsWellnessProgram.created && this.modified == wsWellnessProgram.modified && this.visible == wsWellnessProgram.visible && u.e(this.familyid, wsWellnessProgram.familyid) && u.e(this.specifics, wsWellnessProgram.specifics) && u.e(this.durationJson, wsWellnessProgram.durationJson) && u.e(this.eligibility, wsWellnessProgram.eligibility) && u.e(this.countryCodes, wsWellnessProgram.countryCodes) && u.e(this.data, wsWellnessProgram.data) && this.isSuggested == wsWellnessProgram.isSuggested && this.accessLevel == wsWellnessProgram.accessLevel) {
            return true;
        }
        return false;
    }

    public final int getAccessLevel() {
        return this.accessLevel;
    }

    public final List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public final long getCreated() {
        return this.created;
    }

    public final WsData getData() {
        return this.data;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final WsDurationJson getDurationJson() {
        return this.durationJson;
    }

    public final WsEligibility getEligibility() {
        return this.eligibility;
    }

    public final Long getFamilyid() {
        return this.familyid;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final WsSpecifics getSpecifics() {
        return this.specifics;
    }

    public final int getTargetType() {
        return this.targetType;
    }

    public final String getTargetValue() {
        return this.targetValue;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int a11 = y1.a(this.visible, c.a(this.modified, c.a(this.created, d.c(this.targetValue, h.a(this.targetType, d.c(this.deployment, Integer.hashCode(this.programId) * 31, 31), 31), 31), 31), 31), 31);
        Long l5 = this.familyid;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        WsSpecifics wsSpecifics = this.specifics;
        if (wsSpecifics == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = wsSpecifics.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        WsDurationJson wsDurationJson = this.durationJson;
        if (wsDurationJson == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = wsDurationJson.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        WsEligibility wsEligibility = this.eligibility;
        if (wsEligibility == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = wsEligibility.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        List<String> list = this.countryCodes;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        WsData wsData = this.data;
        if (wsData != null) {
            i11 = wsData.hashCode();
        }
        return Integer.hashCode(this.accessLevel) + y1.a(this.isSuggested, (i16 + i11) * 31, 31);
    }

    public final boolean isSuggested() {
        return this.isSuggested;
    }

    public String toString() {
        int i11 = this.programId;
        String str = this.deployment;
        int i12 = this.targetType;
        String str2 = this.targetValue;
        long j5 = this.created;
        long j11 = this.modified;
        boolean z5 = this.visible;
        Long l5 = this.familyid;
        WsSpecifics wsSpecifics = this.specifics;
        WsDurationJson wsDurationJson = this.durationJson;
        WsEligibility wsEligibility = this.eligibility;
        List<String> list = this.countryCodes;
        WsData wsData = this.data;
        boolean z11 = this.isSuggested;
        int i13 = this.accessLevel;
        StringBuilder a11 = d.a("WsWellnessProgram(programId=", i11, ", deployment=", str, ", targetType=");
        v.c(a11, i12, ", targetValue=", str2, ", created=");
        a11.append(j5);
        g.d(a11, ", modified=", j11, ", visible=");
        a11.append(z5);
        a11.append(", familyid=");
        a11.append(l5);
        a11.append(", specifics=");
        a11.append(wsSpecifics);
        a11.append(", durationJson=");
        a11.append(wsDurationJson);
        a11.append(", eligibility=");
        a11.append(wsEligibility);
        a11.append(", countryCodes=");
        a11.append(list);
        a11.append(", data=");
        a11.append(wsData);
        a11.append(", isSuggested=");
        a11.append(z11);
        a11.append(", accessLevel=");
        return e.c(a11, i13, ")");
    }

    public WsWellnessProgram(int i11, String deployment, int i12, String targetValue, long j5, long j11, boolean z5, Long l5, WsSpecifics wsSpecifics, WsDurationJson wsDurationJson, WsEligibility wsEligibility, List<String> list, WsData wsData, boolean z11, int i13) {
        u.j(deployment, "deployment");
        u.j(targetValue, "targetValue");
        this.programId = i11;
        this.deployment = deployment;
        this.targetType = i12;
        this.targetValue = targetValue;
        this.created = j5;
        this.modified = j11;
        this.visible = z5;
        this.familyid = l5;
        this.specifics = wsSpecifics;
        this.durationJson = wsDurationJson;
        this.eligibility = wsEligibility;
        this.countryCodes = list;
        this.data = wsData;
        this.isSuggested = z11;
        this.accessLevel = i13;
    }

    public /* synthetic */ WsWellnessProgram(int i11, String str, int i12, String str2, long j5, long j11, boolean z5, Long l5, WsSpecifics wsSpecifics, WsDurationJson wsDurationJson, WsEligibility wsEligibility, List list, WsData wsData, boolean z11, int i13, int i14, m mVar) {
        this(i11, str, i12, str2, j5, j11, z5, l5, (i14 & 256) != 0 ? null : wsSpecifics, (i14 & 512) != 0 ? null : wsDurationJson, (i14 & 1024) != 0 ? null : wsEligibility, (i14 & ModuleCopy.f28574b) != 0 ? null : list, (i14 & 4096) != 0 ? null : wsData, z11, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? 0 : i13);
    }
}
