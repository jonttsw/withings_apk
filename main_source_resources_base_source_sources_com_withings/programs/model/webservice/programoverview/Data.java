package com.withings.programs.model.webservice.programoverview;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.webservice.WsRecommendedDevice;
import com.withings.contentproviders.eightfit.model.webservice.WsRecommendedDevice$$serializer;
import com.withings.contentproviders.eightfit.model.webservice.WsTag;
import com.withings.contentproviders.eightfit.model.webservice.WsTag$$serializer;
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
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: Data.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB[\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b@\u0010AB}\b\u0011\u0012\u0006\u0010B\u001a\u00020\u001c\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\b@\u0010EJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJt\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J(\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&HÁ\u0001¢\u0006\u0004\b)\u0010*R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010\u0004\"\u0004\b.\u0010/R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b0\u0010\u0004\"\u0004\b1\u0010/R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u00102\u001a\u0004\b3\u0010\t\"\u0004\b4\u00105R\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b6\u0010\u0004\"\u0004\b7\u0010/R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010,\u001a\u0004\b8\u0010\u0004\"\u0004\b9\u0010/R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b:\u0010\t\"\u0004\b;\u00105R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010,\u001a\u0004\b<\u0010\u0004\"\u0004\b=\u0010/R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u00102\u001a\u0004\b>\u0010\t\"\u0004\b?\u00105¨\u0006H"}, d2 = {"Lcom/withings/programs/model/webservice/programoverview/Data;", "", "", "component1", "()Ljava/lang/String;", "component2", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component3", "()Ljava/util/List;", "component4", "component5", "Lcom/withings/programs/model/webservice/programoverview/ContentTypePreviewDto;", "component6", "component7", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "component8", "identifier", "title", "tags", "featureImage", HealthConstants.FoodInfo.DESCRIPTION, "contentTypePreview", "deviceDescription", "recommendedDevices", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/withings/programs/model/webservice/programoverview/Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/programoverview/Data;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIdentifier", "setIdentifier", "(Ljava/lang/String;)V", "getTitle", "setTitle", "Ljava/util/List;", "getTags", "setTags", "(Ljava/util/List;)V", "getFeatureImage", "setFeatureImage", "getDescription", "setDescription", "getContentTypePreview", "setContentTypePreview", "getDeviceDescription", "setDeviceDescription", "getRecommendedDevices", "setRecommendedDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class Data {
    @SerializedName("content_type_preview")
    private List<ContentTypePreviewDto> contentTypePreview;
    @SerializedName(HealthConstants.FoodInfo.DESCRIPTION)
    private String description;
    @SerializedName("device_description")
    private String deviceDescription;
    @SerializedName("feature_image")
    private String featureImage;
    @SerializedName("identifier")
    private String identifier;
    @SerializedName("recommended_devices")
    private List<WsRecommendedDevice> recommendedDevices;
    @SerializedName("tags")
    private List<WsTag> tags;
    @SerializedName("title")
    private String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE), null, null, new ArrayListSerializer(ContentTypePreviewDto$$serializer.INSTANCE), null, new ArrayListSerializer(WsRecommendedDevice$$serializer.INSTANCE)};

    /* compiled from: Data.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/programoverview/Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/programoverview/Data;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public /* synthetic */ Data(int i11, String str, String str2, List list, String str3, String str4, List list2, String str5, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i11 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 255, Data$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.title = str2;
        this.tags = list;
        this.featureImage = str3;
        this.description = str4;
        this.contentTypePreview = list2;
        this.deviceDescription = str5;
        this.recommendedDevices = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, String str, String str2, List list, String str3, String str4, List list2, String str5, List list3, int i11, Object obj) {
        String str6;
        String str7;
        List<WsTag> list4;
        String str8;
        String str9;
        List<ContentTypePreviewDto> list5;
        String str10;
        List<WsRecommendedDevice> list6;
        if ((i11 & 1) != 0) {
            str6 = data.identifier;
        } else {
            str6 = str;
        }
        if ((i11 & 2) != 0) {
            str7 = data.title;
        } else {
            str7 = str2;
        }
        if ((i11 & 4) != 0) {
            list4 = data.tags;
        } else {
            list4 = list;
        }
        if ((i11 & 8) != 0) {
            str8 = data.featureImage;
        } else {
            str8 = str3;
        }
        if ((i11 & 16) != 0) {
            str9 = data.description;
        } else {
            str9 = str4;
        }
        if ((i11 & 32) != 0) {
            list5 = data.contentTypePreview;
        } else {
            list5 = list2;
        }
        if ((i11 & 64) != 0) {
            str10 = data.deviceDescription;
        } else {
            str10 = str5;
        }
        if ((i11 & 128) != 0) {
            list6 = data.recommendedDevices;
        } else {
            list6 = list3;
        }
        return data.copy(str6, str7, list4, str8, str9, list5, str10, list6);
    }

    public static final /* synthetic */ void write$Self$android_release(Data data, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, data.identifier);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, data.title);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], data.tags);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, data.featureImage);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, data.description);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], data.contentTypePreview);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, data.deviceDescription);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], data.recommendedDevices);
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.title;
    }

    public final List<WsTag> component3() {
        return this.tags;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final String component5() {
        return this.description;
    }

    public final List<ContentTypePreviewDto> component6() {
        return this.contentTypePreview;
    }

    public final String component7() {
        return this.deviceDescription;
    }

    public final List<WsRecommendedDevice> component8() {
        return this.recommendedDevices;
    }

    public final Data copy(String identifier, String title, List<WsTag> tags, String featureImage, String description, List<ContentTypePreviewDto> contentTypePreview, String str, List<WsRecommendedDevice> recommendedDevices) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(tags, "tags");
        u.j(featureImage, "featureImage");
        u.j(description, "description");
        u.j(contentTypePreview, "contentTypePreview");
        u.j(recommendedDevices, "recommendedDevices");
        return new Data(identifier, title, tags, featureImage, description, contentTypePreview, str, recommendedDevices);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        if (u.e(this.identifier, data.identifier) && u.e(this.title, data.title) && u.e(this.tags, data.tags) && u.e(this.featureImage, data.featureImage) && u.e(this.description, data.description) && u.e(this.contentTypePreview, data.contentTypePreview) && u.e(this.deviceDescription, data.deviceDescription) && u.e(this.recommendedDevices, data.recommendedDevices)) {
            return true;
        }
        return false;
    }

    public final List<ContentTypePreviewDto> getContentTypePreview() {
        return this.contentTypePreview;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDeviceDescription() {
        return this.deviceDescription;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<WsRecommendedDevice> getRecommendedDevices() {
        return this.recommendedDevices;
    }

    public final List<WsTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int b10 = e.b(this.contentTypePreview, d.c(this.description, d.c(this.featureImage, e.b(this.tags, d.c(this.title, this.identifier.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.deviceDescription;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.recommendedDevices.hashCode() + ((b10 + hashCode) * 31);
    }

    public final void setContentTypePreview(List<ContentTypePreviewDto> list) {
        u.j(list, "<set-?>");
        this.contentTypePreview = list;
    }

    public final void setDescription(String str) {
        u.j(str, "<set-?>");
        this.description = str;
    }

    public final void setDeviceDescription(String str) {
        this.deviceDescription = str;
    }

    public final void setFeatureImage(String str) {
        u.j(str, "<set-?>");
        this.featureImage = str;
    }

    public final void setIdentifier(String str) {
        u.j(str, "<set-?>");
        this.identifier = str;
    }

    public final void setRecommendedDevices(List<WsRecommendedDevice> list) {
        u.j(list, "<set-?>");
        this.recommendedDevices = list;
    }

    public final void setTags(List<WsTag> list) {
        u.j(list, "<set-?>");
        this.tags = list;
    }

    public final void setTitle(String str) {
        u.j(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.title;
        List<WsTag> list = this.tags;
        String str3 = this.featureImage;
        String str4 = this.description;
        List<ContentTypePreviewDto> list2 = this.contentTypePreview;
        String str5 = this.deviceDescription;
        List<WsRecommendedDevice> list3 = this.recommendedDevices;
        StringBuilder b10 = l0.b("Data(identifier=", str, ", title=", str2, ", tags=");
        b10.append(list);
        b10.append(", featureImage=");
        b10.append(str3);
        b10.append(", description=");
        c.d(b10, str4, ", contentTypePreview=", list2, ", deviceDescription=");
        b10.append(str5);
        b10.append(", recommendedDevices=");
        b10.append(list3);
        b10.append(")");
        return b10.toString();
    }

    public Data(String identifier, String title, List<WsTag> tags, String featureImage, String description, List<ContentTypePreviewDto> contentTypePreview, String str, List<WsRecommendedDevice> recommendedDevices) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(tags, "tags");
        u.j(featureImage, "featureImage");
        u.j(description, "description");
        u.j(contentTypePreview, "contentTypePreview");
        u.j(recommendedDevices, "recommendedDevices");
        this.identifier = identifier;
        this.title = title;
        this.tags = tags;
        this.featureImage = featureImage;
        this.description = description;
        this.contentTypePreview = contentTypePreview;
        this.deviceDescription = str;
        this.recommendedDevices = recommendedDevices;
    }
}
