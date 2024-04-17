package com.withings.programs.model.program;

import androidx.camera.camera2.internal.l0;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import li.a;
/* compiled from: Data.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABY\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010\"\u001a\u00020\u0014\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0017¢\u0006\u0004\b;\u0010<Bw\b\u0011\u0012\u0006\u0010=\u001a\u00020(\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0017\u0012\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b;\u0010@J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJp\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00142\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\rJ\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u001d\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\rR\u001a\u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b1\u0010\rR\u001a\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b2\u0010\rR\u001a\u0010 \u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010/\u001a\u0004\b3\u0010\rR\u001a\u0010!\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b5\u0010\u0013R\u001a\u0010\"\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\b7\u0010\u0016R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b9\u0010\u001aR\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\b:\u0010\u001a¨\u0006C"}, d2 = {"Lcom/withings/programs/model/program/Data;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/program/Data;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Lcom/withings/programs/model/program/Duration;", "component5", "()Lcom/withings/programs/model/program/Duration;", "Lcom/withings/programs/model/program/Category;", "component6", "()Lcom/withings/programs/model/program/Category;", "", "Lli/a;", "component7", "()Ljava/util/List;", "Lcom/withings/programs/model/program/EventInfo;", "component8", "identifier", "title", "subtitle", "thumbnail", "duration", "category", "capabilities", "eventInfo", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/program/Duration;Lcom/withings/programs/model/program/Category;Ljava/util/List;Ljava/util/List;)Lcom/withings/programs/model/program/Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getTitle", "getSubtitle", "getThumbnail", "Lcom/withings/programs/model/program/Duration;", "getDuration", "Lcom/withings/programs/model/program/Category;", "getCategory", "Ljava/util/List;", "getCapabilities", "getEventInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/program/Duration;Lcom/withings/programs/model/program/Category;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/program/Duration;Lcom/withings/programs/model/program/Category;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Data {
    @SerializedName("capabilities")
    private final List<a> capabilities;
    @SerializedName("category")
    private final Category category;
    @SerializedName("duration")
    private final Duration duration;
    @SerializedName("event_info")
    private final List<EventInfo> eventInfo;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("subtitle")
    private final String subtitle;
    @SerializedName("thumbnail")
    private final String thumbnail;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(a.C1257a.f79729a), new ArrayListSerializer(EventInfo$$serializer.INSTANCE)};

    /* compiled from: Data.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/program/Data;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Data> serializer() {
            return Data$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Data(int i11, String str, String str2, String str3, String str4, Duration duration, Category category, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i11 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 127, Data$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.title = str2;
        this.subtitle = str3;
        this.thumbnail = str4;
        this.duration = duration;
        this.category = category;
        this.capabilities = list;
        if ((i11 & 128) == 0) {
            this.eventInfo = null;
        } else {
            this.eventInfo = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, Duration duration, Category category, List list, List list2, int i11, Object obj) {
        String str5;
        String str6;
        String str7;
        String str8;
        Duration duration2;
        Category category2;
        List<a> list3;
        List<EventInfo> list4;
        if ((i11 & 1) != 0) {
            str5 = data.identifier;
        } else {
            str5 = str;
        }
        if ((i11 & 2) != 0) {
            str6 = data.title;
        } else {
            str6 = str2;
        }
        if ((i11 & 4) != 0) {
            str7 = data.subtitle;
        } else {
            str7 = str3;
        }
        if ((i11 & 8) != 0) {
            str8 = data.thumbnail;
        } else {
            str8 = str4;
        }
        if ((i11 & 16) != 0) {
            duration2 = data.duration;
        } else {
            duration2 = duration;
        }
        if ((i11 & 32) != 0) {
            category2 = data.category;
        } else {
            category2 = category;
        }
        if ((i11 & 64) != 0) {
            list3 = data.capabilities;
        } else {
            list3 = list;
        }
        if ((i11 & 128) != 0) {
            list4 = data.eventInfo;
        } else {
            list4 = list2;
        }
        return data.copy(str5, str6, str7, str8, duration2, category2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$android_release(Data data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, data.identifier);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, data.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, data.subtitle);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, data.thumbnail);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, Duration$$serializer.INSTANCE, data.duration);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, Category$$serializer.INSTANCE, data.category);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], data.capabilities);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || data.eventInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], data.eventInfo);
        }
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.thumbnail;
    }

    public final Duration component5() {
        return this.duration;
    }

    public final Category component6() {
        return this.category;
    }

    public final List<a> component7() {
        return this.capabilities;
    }

    public final List<EventInfo> component8() {
        return this.eventInfo;
    }

    public final Data copy(String identifier, String title, String subtitle, String thumbnail, Duration duration, Category category, List<a> list, List<EventInfo> list2) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(subtitle, "subtitle");
        u.j(thumbnail, "thumbnail");
        u.j(duration, "duration");
        u.j(category, "category");
        return new Data(identifier, title, subtitle, thumbnail, duration, category, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        if (u.e(this.identifier, data.identifier) && u.e(this.title, data.title) && u.e(this.subtitle, data.subtitle) && u.e(this.thumbnail, data.thumbnail) && u.e(this.duration, data.duration) && u.e(this.category, data.category) && u.e(this.capabilities, data.capabilities) && u.e(this.eventInfo, data.eventInfo)) {
            return true;
        }
        return false;
    }

    public final List<a> getCapabilities() {
        return this.capabilities;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final List<EventInfo> getEventInfo() {
        return this.eventInfo;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.category.hashCode() + ((this.duration.hashCode() + d.c(this.thumbnail, d.c(this.subtitle, d.c(this.title, this.identifier.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        List<a> list = this.capabilities;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        List<EventInfo> list2 = this.eventInfo;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.thumbnail;
        Duration duration = this.duration;
        Category category = this.category;
        List<a> list = this.capabilities;
        List<EventInfo> list2 = this.eventInfo;
        StringBuilder b10 = l0.b("Data(identifier=", str, ", title=", str2, ", subtitle=");
        b.d(b10, str3, ", thumbnail=", str4, ", duration=");
        b10.append(duration);
        b10.append(", category=");
        b10.append(category);
        b10.append(", capabilities=");
        b10.append(list);
        b10.append(", eventInfo=");
        b10.append(list2);
        b10.append(")");
        return b10.toString();
    }

    public Data(String identifier, String title, String subtitle, String thumbnail, Duration duration, Category category, List<a> list, List<EventInfo> list2) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(subtitle, "subtitle");
        u.j(thumbnail, "thumbnail");
        u.j(duration, "duration");
        u.j(category, "category");
        this.identifier = identifier;
        this.title = title;
        this.subtitle = subtitle;
        this.thumbnail = thumbnail;
        this.duration = duration;
        this.category = category;
        this.capabilities = list;
        this.eventInfo = list2;
    }

    public /* synthetic */ Data(String str, String str2, String str3, String str4, Duration duration, Category category, List list, List list2, int i11, m mVar) {
        this(str, str2, str3, str4, duration, category, list, (i11 & 128) != 0 ? null : list2);
    }
}
