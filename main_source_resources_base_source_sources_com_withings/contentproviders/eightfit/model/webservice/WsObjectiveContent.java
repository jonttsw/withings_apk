package com.withings.contentproviders.eightfit.model.webservice;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.content.EightFitObjectiveContent;
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
/* compiled from: WsObjectiveContent.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBg\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\bF\u0010GB\u0087\u0001\b\u0011\u0012\u0006\u0010H\u001a\u00020\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010J\u001a\u0004\u0018\u00010I¢\u0006\u0004\bF\u0010KJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0007J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0007J\u0084\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\b\b\u0002\u0010$\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u0007J\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010\u0013J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J(\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201HÁ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00107\u001a\u0004\b8\u0010\u0007R\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b9\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b:\u0010\u0007R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b<\u0010\rR\u001a\u0010\u001f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\b>\u0010\u0010R\u001a\u0010 \u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010?\u001a\u0004\b@\u0010\u0013R\u001c\u0010!\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010A\u001a\u0004\bB\u0010\u0016R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00107\u001a\u0004\bC\u0010\u0007R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010;\u001a\u0004\bD\u0010\rR\u001a\u0010$\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\bE\u0010\u0007¨\u0006N"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component4", "()Ljava/util/List;", "", "component5", "()D", "", "component6", "()I", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component7", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component8", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "component9", "component10", "title", HealthConstants.FoodInfo.DESCRIPTION, "featureImage", "tags", "goal", "measureType", "contextualized", "contextualizedDescription", "recommendedDevices", "identifier", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DILcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getDescription", "getFeatureImage", "Ljava/util/List;", "getTags", "D", "getGoal", "I", "getMeasureType", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "getContextualized", "getContextualizedDescription", "getRecommendedDevices", "getIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DILcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DILcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsObjectiveContent extends WsContent {
    @SerializedName("contextualized")
    private final WsContextualized contextualized;
    @SerializedName("contextualized_description")
    private final String contextualizedDescription;
    @SerializedName(HealthConstants.FoodInfo.DESCRIPTION)
    private final String description;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("goal")
    private final double goal;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("measure_type")
    private final int measureType;
    @SerializedName("recommended_devices")
    private final List<WsRecommendedDevice> recommendedDevices;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(WsRecommendedDevice$$serializer.INSTANCE), null};

    /* compiled from: WsObjectiveContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsObjectiveContent> serializer() {
            return WsObjectiveContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsObjectiveContent(int i11, String str, String str2, String str3, List list, double d11, int i12, WsContextualized wsContextualized, String str4, List list2, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (1023 != (i11 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1023, WsObjectiveContent$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.featureImage = str3;
        this.tags = list;
        this.goal = d11;
        this.measureType = i12;
        this.contextualized = wsContextualized;
        this.contextualizedDescription = str4;
        this.recommendedDevices = list2;
        this.identifier = str5;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsObjectiveContent copy$default(WsObjectiveContent wsObjectiveContent, String str, String str2, String str3, List list, double d11, int i11, WsContextualized wsContextualized, String str4, List list2, String str5, int i12, Object obj) {
        String str6;
        String str7;
        String str8;
        List<WsTag> list3;
        double d12;
        int i13;
        WsContextualized wsContextualized2;
        String str9;
        List<WsRecommendedDevice> list4;
        String str10;
        if ((i12 & 1) != 0) {
            str6 = wsObjectiveContent.title;
        } else {
            str6 = str;
        }
        if ((i12 & 2) != 0) {
            str7 = wsObjectiveContent.description;
        } else {
            str7 = str2;
        }
        if ((i12 & 4) != 0) {
            str8 = wsObjectiveContent.featureImage;
        } else {
            str8 = str3;
        }
        if ((i12 & 8) != 0) {
            list3 = wsObjectiveContent.tags;
        } else {
            list3 = list;
        }
        if ((i12 & 16) != 0) {
            d12 = wsObjectiveContent.goal;
        } else {
            d12 = d11;
        }
        if ((i12 & 32) != 0) {
            i13 = wsObjectiveContent.measureType;
        } else {
            i13 = i11;
        }
        if ((i12 & 64) != 0) {
            wsContextualized2 = wsObjectiveContent.contextualized;
        } else {
            wsContextualized2 = wsContextualized;
        }
        if ((i12 & 128) != 0) {
            str9 = wsObjectiveContent.contextualizedDescription;
        } else {
            str9 = str4;
        }
        if ((i12 & 256) != 0) {
            list4 = wsObjectiveContent.recommendedDevices;
        } else {
            list4 = list2;
        }
        if ((i12 & 512) != 0) {
            str10 = wsObjectiveContent.identifier;
        } else {
            str10 = str5;
        }
        return wsObjectiveContent.copy(str6, str7, str8, list3, d12, i13, wsContextualized2, str9, list4, str10);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsObjectiveContent wsObjectiveContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsObjectiveContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsObjectiveContent.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsObjectiveContent.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsObjectiveContent.featureImage);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], wsObjectiveContent.tags);
        compositeEncoder.encodeDoubleElement(serialDescriptor, 4, wsObjectiveContent.goal);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, wsObjectiveContent.measureType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, WsContextualized$$serializer.INSTANCE, wsObjectiveContent.contextualized);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, wsObjectiveContent.contextualizedDescription);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], wsObjectiveContent.recommendedDevices);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, wsObjectiveContent.identifier);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.identifier;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.featureImage;
    }

    public final List<WsTag> component4() {
        return this.tags;
    }

    public final double component5() {
        return this.goal;
    }

    public final int component6() {
        return this.measureType;
    }

    public final WsContextualized component7() {
        return this.contextualized;
    }

    public final String component8() {
        return this.contextualizedDescription;
    }

    public final List<WsRecommendedDevice> component9() {
        return this.recommendedDevices;
    }

    public final WsObjectiveContent copy(String title, String description, String featureImage, List<WsTag> tags, double d11, int i11, WsContextualized wsContextualized, String str, List<WsRecommendedDevice> recommendedDevices, String identifier) {
        u.j(title, "title");
        u.j(description, "description");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(recommendedDevices, "recommendedDevices");
        u.j(identifier, "identifier");
        return new WsObjectiveContent(title, description, featureImage, tags, d11, i11, wsContextualized, str, recommendedDevices, identifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsObjectiveContent)) {
            return false;
        }
        WsObjectiveContent wsObjectiveContent = (WsObjectiveContent) obj;
        if (u.e(this.title, wsObjectiveContent.title) && u.e(this.description, wsObjectiveContent.description) && u.e(this.featureImage, wsObjectiveContent.featureImage) && u.e(this.tags, wsObjectiveContent.tags) && Double.compare(this.goal, wsObjectiveContent.goal) == 0 && this.measureType == wsObjectiveContent.measureType && u.e(this.contextualized, wsObjectiveContent.contextualized) && u.e(this.contextualizedDescription, wsObjectiveContent.contextualizedDescription) && u.e(this.recommendedDevices, wsObjectiveContent.recommendedDevices) && u.e(this.identifier, wsObjectiveContent.identifier)) {
            return true;
        }
        return false;
    }

    public final WsContextualized getContextualized() {
        return this.contextualized;
    }

    public final String getContextualizedDescription() {
        return this.contextualizedDescription;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final double getGoal() {
        return this.goal;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final int getMeasureType() {
        return this.measureType;
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
        int a11 = h.a(this.measureType, l0.a(this.goal, e.b(this.tags, d.c(this.featureImage, d.c(this.description, this.title.hashCode() * 31, 31), 31), 31), 31), 31);
        WsContextualized wsContextualized = this.contextualized;
        int i11 = 0;
        if (wsContextualized == null) {
            hashCode = 0;
        } else {
            hashCode = wsContextualized.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        String str = this.contextualizedDescription;
        if (str != null) {
            i11 = str.hashCode();
        }
        return this.identifier.hashCode() + e.b(this.recommendedDevices, (i12 + i11) * 31, 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.featureImage;
        List<WsTag> list = this.tags;
        double d11 = this.goal;
        int i11 = this.measureType;
        WsContextualized wsContextualized = this.contextualized;
        String str4 = this.contextualizedDescription;
        List<WsRecommendedDevice> list2 = this.recommendedDevices;
        String str5 = this.identifier;
        StringBuilder b10 = l0.b("WsObjectiveContent(title=", str, ", description=", str2, ", featureImage=");
        c.d(b10, str3, ", tags=", list, ", goal=");
        b10.append(d11);
        b10.append(", measureType=");
        b10.append(i11);
        b10.append(", contextualized=");
        b10.append(wsContextualized);
        b10.append(", contextualizedDescription=");
        b10.append(str4);
        b10.append(", recommendedDevices=");
        b10.append(list2);
        b10.append(", identifier=");
        b10.append(str5);
        b10.append(")");
        return b10.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsObjectiveContent(String title, String description, String featureImage, List<WsTag> tags, double d11, int i11, WsContextualized wsContextualized, String str, List<WsRecommendedDevice> recommendedDevices, String identifier) {
        super(null);
        u.j(title, "title");
        u.j(description, "description");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(recommendedDevices, "recommendedDevices");
        u.j(identifier, "identifier");
        this.title = title;
        this.description = description;
        this.featureImage = featureImage;
        this.tags = tags;
        this.goal = d11;
        this.measureType = i11;
        this.contextualized = wsContextualized;
        this.contextualizedDescription = str;
        this.recommendedDevices = recommendedDevices;
        this.identifier = identifier;
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitObjectiveContent toEightFit() {
        String str;
        String str2 = this.identifier;
        ArrayList d11 = c.d(this.tags);
        String str3 = this.title;
        String str4 = this.featureImage;
        double d12 = this.goal;
        int i11 = this.measureType;
        WsContextualized wsContextualized = this.contextualized;
        if ((wsContextualized == null || (str = wsContextualized.getDescription()) == null) && (str = this.contextualizedDescription) == null) {
            str = this.description;
        }
        return new EightFitObjectiveContent(str2, d11, str3, str, str4, i11, d12, b.c(this.recommendedDevices));
    }
}
