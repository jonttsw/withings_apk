package com.withings.programs.model.remote.enrolled;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
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
/* compiled from: IterationDto.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0087\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bN\u0010OB\u008f\u0001\b\u0011\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bN\u0010SJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b)\u0010\u0013J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0004J\u001a\u0010,\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J(\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201HÁ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00109\u001a\u0004\b:\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b;\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b<\u0010\u0004R\"\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010?R$\u0010 \u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010@\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010CR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010D\u001a\u0004\bE\u0010\u0010R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010F\u001a\u0004\bG\u0010\u0013R\u001c\u0010#\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010F\u001a\u0004\bH\u0010\u0013R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010\u0016R\u001c\u0010%\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010K\u001a\u0004\bL\u0010\u0019R\u001c\u0010&\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\bM\u0010\u0013¨\u0006V"}, d2 = {"Lcom/withings/programs/model/remote/enrolled/IterationDto;", "", "", "component1", "()I", "", "component2", "()J", "component3", "component4", "component5", "component6", "()Ljava/lang/Long;", "", "Lcom/withings/programs/model/remote/enrolled/MenuDto;", "component7", "()Ljava/util/List;", "", "component8", "()Ljava/lang/String;", "component9", "component10", "()Ljava/lang/Integer;", "", "component11", "()Ljava/lang/Boolean;", "component12", NavigationArguments.PROGRAM_ID, "iteration", NavigationArguments.INSTANCE_ID, "status", "start", "end", "menuDtos", "summary", "fullSummary", "progress", "unread", "programSwToken", "copy", "(IJIIJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/withings/programs/model/remote/enrolled/IterationDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/remote/enrolled/IterationDto;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getProgramId", "J", "getIteration", "getInstanceId", "getStatus", "getStart", "setStart", "(J)V", "Ljava/lang/Long;", "getEnd", "setEnd", "(Ljava/lang/Long;)V", "Ljava/util/List;", "getMenuDtos", "Ljava/lang/String;", "getSummary", "getFullSummary", "Ljava/lang/Integer;", "getProgress", "Ljava/lang/Boolean;", "getUnread", "getProgramSwToken", "<init>", "(IJIIJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIJIIJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class IterationDto {
    private Long end;
    private final String fullSummary;
    private final int instanceId;
    private final long iteration;
    private final List<MenuDto> menuDtos;
    private final int programId;
    private final String programSwToken;
    private final Integer progress;
    private long start;
    private final int status;
    private final String summary;
    private final Boolean unread;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(MenuDto$$serializer.INSTANCE), null, null, null, null, null};

    /* compiled from: IterationDto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/remote/enrolled/IterationDto$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/remote/enrolled/IterationDto;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<IterationDto> serializer() {
            return IterationDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IterationDto(int i11, int i12, long j5, int i13, int i14, long j11, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i11 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 63, IterationDto$$serializer.INSTANCE.getDescriptor());
        }
        this.programId = i12;
        this.iteration = j5;
        this.instanceId = i13;
        this.status = i14;
        this.start = j11;
        this.end = l5;
        if ((i11 & 64) == 0) {
            this.menuDtos = null;
        } else {
            this.menuDtos = list;
        }
        if ((i11 & 128) == 0) {
            this.summary = null;
        } else {
            this.summary = str;
        }
        if ((i11 & 256) == 0) {
            this.fullSummary = null;
        } else {
            this.fullSummary = str2;
        }
        if ((i11 & 512) == 0) {
            this.progress = null;
        } else {
            this.progress = num;
        }
        if ((i11 & 1024) == 0) {
            this.unread = null;
        } else {
            this.unread = bool;
        }
        if ((i11 & ModuleCopy.f28574b) == 0) {
            this.programSwToken = null;
        } else {
            this.programSwToken = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IterationDto copy$default(IterationDto iterationDto, int i11, long j5, int i12, int i13, long j11, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, int i14, Object obj) {
        int i15;
        long j12;
        int i16;
        int i17;
        long j13;
        Long l6;
        List<MenuDto> list2;
        String str4;
        String str5;
        Integer num2;
        Boolean bool2;
        String str6;
        if ((i14 & 1) != 0) {
            i15 = iterationDto.programId;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            j12 = iterationDto.iteration;
        } else {
            j12 = j5;
        }
        if ((i14 & 4) != 0) {
            i16 = iterationDto.instanceId;
        } else {
            i16 = i12;
        }
        if ((i14 & 8) != 0) {
            i17 = iterationDto.status;
        } else {
            i17 = i13;
        }
        if ((i14 & 16) != 0) {
            j13 = iterationDto.start;
        } else {
            j13 = j11;
        }
        if ((i14 & 32) != 0) {
            l6 = iterationDto.end;
        } else {
            l6 = l5;
        }
        if ((i14 & 64) != 0) {
            list2 = iterationDto.menuDtos;
        } else {
            list2 = list;
        }
        if ((i14 & 128) != 0) {
            str4 = iterationDto.summary;
        } else {
            str4 = str;
        }
        if ((i14 & 256) != 0) {
            str5 = iterationDto.fullSummary;
        } else {
            str5 = str2;
        }
        if ((i14 & 512) != 0) {
            num2 = iterationDto.progress;
        } else {
            num2 = num;
        }
        if ((i14 & 1024) != 0) {
            bool2 = iterationDto.unread;
        } else {
            bool2 = bool;
        }
        if ((i14 & ModuleCopy.f28574b) != 0) {
            str6 = iterationDto.programSwToken;
        } else {
            str6 = str3;
        }
        return iterationDto.copy(i15, j12, i16, i17, j13, l6, list2, str4, str5, num2, bool2, str6);
    }

    public static final /* synthetic */ void write$Self$android_release(IterationDto iterationDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, iterationDto.programId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, iterationDto.iteration);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, iterationDto.instanceId);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, iterationDto.status);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, iterationDto.start);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, iterationDto.end);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || iterationDto.menuDtos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], iterationDto.menuDtos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || iterationDto.summary != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, iterationDto.summary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || iterationDto.fullSummary != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, iterationDto.fullSummary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || iterationDto.progress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, iterationDto.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || iterationDto.unread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, iterationDto.unread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || iterationDto.programSwToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, iterationDto.programSwToken);
        }
    }

    public final int component1() {
        return this.programId;
    }

    public final Integer component10() {
        return this.progress;
    }

    public final Boolean component11() {
        return this.unread;
    }

    public final String component12() {
        return this.programSwToken;
    }

    public final long component2() {
        return this.iteration;
    }

    public final int component3() {
        return this.instanceId;
    }

    public final int component4() {
        return this.status;
    }

    public final long component5() {
        return this.start;
    }

    public final Long component6() {
        return this.end;
    }

    public final List<MenuDto> component7() {
        return this.menuDtos;
    }

    public final String component8() {
        return this.summary;
    }

    public final String component9() {
        return this.fullSummary;
    }

    public final IterationDto copy(int i11, long j5, int i12, int i13, long j11, Long l5, List<MenuDto> list, String str, String str2, Integer num, Boolean bool, String str3) {
        return new IterationDto(i11, j5, i12, i13, j11, l5, list, str, str2, num, bool, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IterationDto)) {
            return false;
        }
        IterationDto iterationDto = (IterationDto) obj;
        if (this.programId == iterationDto.programId && this.iteration == iterationDto.iteration && this.instanceId == iterationDto.instanceId && this.status == iterationDto.status && this.start == iterationDto.start && u.e(this.end, iterationDto.end) && u.e(this.menuDtos, iterationDto.menuDtos) && u.e(this.summary, iterationDto.summary) && u.e(this.fullSummary, iterationDto.fullSummary) && u.e(this.progress, iterationDto.progress) && u.e(this.unread, iterationDto.unread) && u.e(this.programSwToken, iterationDto.programSwToken)) {
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

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final long getIteration() {
        return this.iteration;
    }

    public final List<MenuDto> getMenuDtos() {
        return this.menuDtos;
    }

    public final int getProgramId() {
        return this.programId;
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
        int a11 = c.a(this.start, h.a(this.status, h.a(this.instanceId, c.a(this.iteration, Integer.hashCode(this.programId) * 31, 31), 31), 31), 31);
        Long l5 = this.end;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        List<MenuDto> list = this.menuDtos;
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
        int i11 = this.programId;
        long j5 = this.iteration;
        int i12 = this.instanceId;
        int i13 = this.status;
        long j11 = this.start;
        Long l5 = this.end;
        List<MenuDto> list = this.menuDtos;
        String str = this.summary;
        String str2 = this.fullSummary;
        Integer num = this.progress;
        Boolean bool = this.unread;
        String str3 = this.programSwToken;
        StringBuilder sb2 = new StringBuilder("IterationDto(programId=");
        sb2.append(i11);
        sb2.append(", iteration=");
        sb2.append(j5);
        q2.c(sb2, ", instanceId=", i12, ", status=", i13);
        g.d(sb2, ", start=", j11, ", end=");
        sb2.append(l5);
        sb2.append(", menuDtos=");
        sb2.append(list);
        sb2.append(", summary=");
        b.d(sb2, str, ", fullSummary=", str2, ", progress=");
        sb2.append(num);
        sb2.append(", unread=");
        sb2.append(bool);
        sb2.append(", programSwToken=");
        return y1.e(sb2, str3, ")");
    }

    public IterationDto(int i11, long j5, int i12, int i13, long j11, Long l5, List<MenuDto> list, String str, String str2, Integer num, Boolean bool, String str3) {
        this.programId = i11;
        this.iteration = j5;
        this.instanceId = i12;
        this.status = i13;
        this.start = j11;
        this.end = l5;
        this.menuDtos = list;
        this.summary = str;
        this.fullSummary = str2;
        this.progress = num;
        this.unread = bool;
        this.programSwToken = str3;
    }

    public /* synthetic */ IterationDto(int i11, long j5, int i12, int i13, long j11, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, int i14, m mVar) {
        this(i11, j5, i12, i13, j11, l5, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : str, (i14 & 256) != 0 ? null : str2, (i14 & 512) != 0 ? null : num, (i14 & 1024) != 0 ? null : bool, (i14 & ModuleCopy.f28574b) != 0 ? null : str3);
    }
}
