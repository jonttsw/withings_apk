package com.withings.contentproviders.eightfit.model.webservice;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitMeasurementContent;
import java.util.ArrayList;
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
import zl.b;
import zl.c;
/* compiled from: WsMeasurementContent.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBi\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010¢\u0006\u0004\bC\u0010DB\u0089\u0001\b\u0011\u0012\u0006\u0010E\u001a\u00020\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010\u0012\b\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bC\u0010HJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0086\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010!\u001a\u00020\u00142\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u0007J\u0010\u0010&\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J(\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/HÁ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u0010\u0007R\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b7\u0010\u0007R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b:\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b;\u0010\u0007R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b<\u0010\u0007R\u001a\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b=\u0010\u0007R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010>\u001a\u0004\b?\u0010\u0013R\u001a\u0010!\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010@\u001a\u0004\bA\u0010\u0016R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\bB\u0010\u0013¨\u0006K"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "", "component1", "()Ljava/lang/String;", "component2", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component3", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component4", "component5", "component6", "component7", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component8", "()Ljava/util/List;", "", "component9", "()I", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "component10", "identifier", "titleWithDevice", "contextualized", "contextualizeDescriptionWithDevice", "titleForManual", "contextualizeDescriptionForManual", "featureImage", "tags", "measureType", "recommendedDevice", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIdentifier", "getTitleWithDevice", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "getContextualized", "getContextualizeDescriptionWithDevice", "getTitleForManual", "getContextualizeDescriptionForManual", "getFeatureImage", "Ljava/util/List;", "getTags", "I", "getMeasureType", "getRecommendedDevice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsMeasurementContent extends WsContent {
    @SerializedName("contextualized_description_for_manual")
    private final String contextualizeDescriptionForManual;
    @SerializedName("contextualized_description_with_device")
    private final String contextualizeDescriptionWithDevice;
    @SerializedName("contextualized")
    private final WsContextualized contextualized;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("measure_type")
    private final int measureType;
    @SerializedName("recommended_devices")
    private final List<WsRecommendedDevice> recommendedDevice;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title_for_manual")
    private final String titleForManual;
    @SerializedName("title_with_device")
    private final String titleWithDevice;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE), null, new ArrayListSerializer(WsRecommendedDevice$$serializer.INSTANCE)};

    /* compiled from: WsMeasurementContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsMeasurementContent> serializer() {
            return WsMeasurementContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsMeasurementContent(int i11, String str, String str2, WsContextualized wsContextualized, String str3, String str4, String str5, String str6, List list, int i12, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (1023 != (i11 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1023, WsMeasurementContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.titleWithDevice = str2;
        this.contextualized = wsContextualized;
        this.contextualizeDescriptionWithDevice = str3;
        this.titleForManual = str4;
        this.contextualizeDescriptionForManual = str5;
        this.featureImage = str6;
        this.tags = list;
        this.measureType = i12;
        this.recommendedDevice = list2;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsMeasurementContent copy$default(WsMeasurementContent wsMeasurementContent, String str, String str2, WsContextualized wsContextualized, String str3, String str4, String str5, String str6, List list, int i11, List list2, int i12, Object obj) {
        String str7;
        String str8;
        WsContextualized wsContextualized2;
        String str9;
        String str10;
        String str11;
        String str12;
        List<WsTag> list3;
        int i13;
        List<WsRecommendedDevice> list4;
        if ((i12 & 1) != 0) {
            str7 = wsMeasurementContent.identifier;
        } else {
            str7 = str;
        }
        if ((i12 & 2) != 0) {
            str8 = wsMeasurementContent.titleWithDevice;
        } else {
            str8 = str2;
        }
        if ((i12 & 4) != 0) {
            wsContextualized2 = wsMeasurementContent.contextualized;
        } else {
            wsContextualized2 = wsContextualized;
        }
        if ((i12 & 8) != 0) {
            str9 = wsMeasurementContent.contextualizeDescriptionWithDevice;
        } else {
            str9 = str3;
        }
        if ((i12 & 16) != 0) {
            str10 = wsMeasurementContent.titleForManual;
        } else {
            str10 = str4;
        }
        if ((i12 & 32) != 0) {
            str11 = wsMeasurementContent.contextualizeDescriptionForManual;
        } else {
            str11 = str5;
        }
        if ((i12 & 64) != 0) {
            str12 = wsMeasurementContent.featureImage;
        } else {
            str12 = str6;
        }
        if ((i12 & 128) != 0) {
            list3 = wsMeasurementContent.tags;
        } else {
            list3 = list;
        }
        if ((i12 & 256) != 0) {
            i13 = wsMeasurementContent.measureType;
        } else {
            i13 = i11;
        }
        if ((i12 & 512) != 0) {
            list4 = wsMeasurementContent.recommendedDevice;
        } else {
            list4 = list2;
        }
        return wsMeasurementContent.copy(str7, str8, wsContextualized2, str9, str10, str11, str12, list3, i13, list4);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsMeasurementContent wsMeasurementContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsMeasurementContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsMeasurementContent.identifier);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsMeasurementContent.titleWithDevice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, WsContextualized$$serializer.INSTANCE, wsMeasurementContent.contextualized);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, wsMeasurementContent.contextualizeDescriptionWithDevice);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, wsMeasurementContent.titleForManual);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, wsMeasurementContent.contextualizeDescriptionForManual);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, wsMeasurementContent.featureImage);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], wsMeasurementContent.tags);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, wsMeasurementContent.measureType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], wsMeasurementContent.recommendedDevice);
    }

    public final String component1() {
        return this.identifier;
    }

    public final List<WsRecommendedDevice> component10() {
        return this.recommendedDevice;
    }

    public final String component2() {
        return this.titleWithDevice;
    }

    public final WsContextualized component3() {
        return this.contextualized;
    }

    public final String component4() {
        return this.contextualizeDescriptionWithDevice;
    }

    public final String component5() {
        return this.titleForManual;
    }

    public final String component6() {
        return this.contextualizeDescriptionForManual;
    }

    public final String component7() {
        return this.featureImage;
    }

    public final List<WsTag> component8() {
        return this.tags;
    }

    public final int component9() {
        return this.measureType;
    }

    public final WsMeasurementContent copy(String identifier, String titleWithDevice, WsContextualized wsContextualized, String str, String titleForManual, String str2, String featureImage, List<WsTag> tags, int i11, List<WsRecommendedDevice> recommendedDevice) {
        u.j(identifier, "identifier");
        u.j(titleWithDevice, "titleWithDevice");
        u.j(titleForManual, "titleForManual");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(recommendedDevice, "recommendedDevice");
        return new WsMeasurementContent(identifier, titleWithDevice, wsContextualized, str, titleForManual, str2, featureImage, tags, i11, recommendedDevice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsMeasurementContent)) {
            return false;
        }
        WsMeasurementContent wsMeasurementContent = (WsMeasurementContent) obj;
        if (u.e(this.identifier, wsMeasurementContent.identifier) && u.e(this.titleWithDevice, wsMeasurementContent.titleWithDevice) && u.e(this.contextualized, wsMeasurementContent.contextualized) && u.e(this.contextualizeDescriptionWithDevice, wsMeasurementContent.contextualizeDescriptionWithDevice) && u.e(this.titleForManual, wsMeasurementContent.titleForManual) && u.e(this.contextualizeDescriptionForManual, wsMeasurementContent.contextualizeDescriptionForManual) && u.e(this.featureImage, wsMeasurementContent.featureImage) && u.e(this.tags, wsMeasurementContent.tags) && this.measureType == wsMeasurementContent.measureType && u.e(this.recommendedDevice, wsMeasurementContent.recommendedDevice)) {
            return true;
        }
        return false;
    }

    public final String getContextualizeDescriptionForManual() {
        return this.contextualizeDescriptionForManual;
    }

    public final String getContextualizeDescriptionWithDevice() {
        return this.contextualizeDescriptionWithDevice;
    }

    public final WsContextualized getContextualized() {
        return this.contextualized;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final List<WsRecommendedDevice> getRecommendedDevice() {
        return this.recommendedDevice;
    }

    public final List<WsTag> getTags() {
        return this.tags;
    }

    public final String getTitleForManual() {
        return this.titleForManual;
    }

    public final String getTitleWithDevice() {
        return this.titleWithDevice;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c11 = d.c(this.titleWithDevice, this.identifier.hashCode() * 31, 31);
        WsContextualized wsContextualized = this.contextualized;
        int i11 = 0;
        if (wsContextualized == null) {
            hashCode = 0;
        } else {
            hashCode = wsContextualized.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        String str = this.contextualizeDescriptionWithDevice;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int c12 = d.c(this.titleForManual, (i12 + hashCode2) * 31, 31);
        String str2 = this.contextualizeDescriptionForManual;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.recommendedDevice.hashCode() + h.a(this.measureType, e.b(this.tags, d.c(this.featureImage, (c12 + i11) * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.titleWithDevice;
        WsContextualized wsContextualized = this.contextualized;
        String str3 = this.contextualizeDescriptionWithDevice;
        String str4 = this.titleForManual;
        String str5 = this.contextualizeDescriptionForManual;
        String str6 = this.featureImage;
        List<WsTag> list = this.tags;
        int i11 = this.measureType;
        List<WsRecommendedDevice> list2 = this.recommendedDevice;
        StringBuilder b10 = l0.b("WsMeasurementContent(identifier=", str, ", titleWithDevice=", str2, ", contextualized=");
        b10.append(wsContextualized);
        b10.append(", contextualizeDescriptionWithDevice=");
        b10.append(str3);
        b10.append(", titleForManual=");
        b.d(b10, str4, ", contextualizeDescriptionForManual=", str5, ", featureImage=");
        c.d(b10, str6, ", tags=", list, ", measureType=");
        b10.append(i11);
        b10.append(", recommendedDevice=");
        b10.append(list2);
        b10.append(")");
        return b10.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsMeasurementContent(String identifier, String titleWithDevice, WsContextualized wsContextualized, String str, String titleForManual, String str2, String featureImage, List<WsTag> tags, int i11, List<WsRecommendedDevice> recommendedDevice) {
        super(null);
        u.j(identifier, "identifier");
        u.j(titleWithDevice, "titleWithDevice");
        u.j(titleForManual, "titleForManual");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(recommendedDevice, "recommendedDevice");
        this.identifier = identifier;
        this.titleWithDevice = titleWithDevice;
        this.contextualized = wsContextualized;
        this.contextualizeDescriptionWithDevice = str;
        this.titleForManual = titleForManual;
        this.contextualizeDescriptionForManual = str2;
        this.featureImage = featureImage;
        this.tags = tags;
        this.measureType = i11;
        this.recommendedDevice = recommendedDevice;
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitMeasurementContent toEightFit() {
        String str;
        String str2;
        String str3 = this.identifier;
        ArrayList d11 = c.d(this.tags);
        String str4 = this.titleWithDevice;
        String str5 = this.titleForManual;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized == null || (str = wsContextualized.getDescription()) == null) {
            str = this.contextualizeDescriptionForManual;
        }
        String str6 = str;
        WsContextualized wsContextualized2 = this.contextualized;
        if (wsContextualized2 == null || (str2 = wsContextualized2.getDescription()) == null) {
            str2 = this.contextualizeDescriptionWithDevice;
        }
        return new EightFitMeasurementContent(str3, d11, str4, str2, str5, str6, this.featureImage, this.measureType, b.c(this.recommendedDevice));
    }
}
