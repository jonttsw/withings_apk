package com.withings.contentproviders.eightfit.model.webservice;

import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.google.gson.annotations.SerializedName;
import com.withings.contentproviders.eightfit.model.content.EightFitContent;
import com.withings.contentproviders.eightfit.model.content.EightFitWorkoutContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
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
/* compiled from: WsWorkoutContent.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBw\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bG\u0010HB\u0099\u0001\b\u0011\u0012\u0006\u0010I\u001a\u00020\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bG\u0010LJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0007J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0096\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\b\b\u0002\u0010\"\u001a\u00020\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010\u0007J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010\nJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J(\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÁ\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010\u0007R\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b<\u0010\u0007R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b=\u0010\u0007R\u001a\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b>\u0010\u0007R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010?\u001a\u0004\b@\u0010\u0011R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010?\u001a\u0004\bA\u0010\u0011R\u001a\u0010\"\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\bB\u0010\u0007R\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\bC\u0010\u0007R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010?\u001a\u0004\bD\u0010\u0011R\u001c\u0010%\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010E\u001a\u0004\bF\u0010\u001a¨\u0006O"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "toEightFit", "()Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "component3", "component4", "component5", "", "Lcom/withings/contentproviders/eightfit/model/webservice/WsTag;", "component6", "()Ljava/util/List;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedEquipment;", "component7", "component8", "component9", "Lcom/withings/contentproviders/eightfit/model/webservice/WsRecommendedDevice;", "component10", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "component11", "()Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "identifier", "dayIndex", "title", "contextualizedDescription", "featureImage", "tags", "prepareItems", "video", "hlsVideo", "recommendedDevices", "contextualized", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;)Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIdentifier", "I", "getDayIndex", "getTitle", "getContextualizedDescription", "getFeatureImage", "Ljava/util/List;", "getTags", "getPrepareItems", "getVideo", "getHlsVideo", "getRecommendedDevices", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;", "getContextualized", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withings/contentproviders/eightfit/model/webservice/WsContextualized;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class WsWorkoutContent extends WsContent {
    @SerializedName("contextualized")
    private final WsContextualized contextualized;
    @SerializedName("contextualized_description")
    private final String contextualizedDescription;
    @SerializedName("day_index")
    private final int dayIndex;
    @SerializedName("feature_image")
    private final String featureImage;
    @SerializedName("hls_video")
    private final String hlsVideo;
    @SerializedName("identifier")
    private final String identifier;
    @SerializedName("prepare_items")
    private final List<WsRecommendedEquipment> prepareItems;
    @SerializedName("recommended_devices")
    private final List<WsRecommendedDevice> recommendedDevices;
    @SerializedName("tags")
    private final List<WsTag> tags;
    @SerializedName("title")
    private final String title;
    @SerializedName("video")
    private final String video;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(WsTag$$serializer.INSTANCE), new ArrayListSerializer(WsRecommendedEquipment$$serializer.INSTANCE), null, null, new ArrayListSerializer(WsRecommendedDevice$$serializer.INSTANCE), null};

    /* compiled from: WsWorkoutContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsWorkoutContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsWorkoutContent> serializer() {
            return WsWorkoutContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WsWorkoutContent(int i11, String str, int i12, String str2, String str3, String str4, List list, List list2, String str5, String str6, List list3, WsContextualized wsContextualized, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (2047 != (i11 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 2047, WsWorkoutContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.dayIndex = i12;
        this.title = str2;
        this.contextualizedDescription = str3;
        this.featureImage = str4;
        this.tags = list;
        this.prepareItems = list2;
        this.video = str5;
        this.hlsVideo = str6;
        this.recommendedDevices = list3;
        this.contextualized = wsContextualized;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsWorkoutContent copy$default(WsWorkoutContent wsWorkoutContent, String str, int i11, String str2, String str3, String str4, List list, List list2, String str5, String str6, List list3, WsContextualized wsContextualized, int i12, Object obj) {
        String str7;
        int i13;
        String str8;
        String str9;
        String str10;
        List<WsTag> list4;
        List<WsRecommendedEquipment> list5;
        String str11;
        String str12;
        List<WsRecommendedDevice> list6;
        WsContextualized wsContextualized2;
        if ((i12 & 1) != 0) {
            str7 = wsWorkoutContent.identifier;
        } else {
            str7 = str;
        }
        if ((i12 & 2) != 0) {
            i13 = wsWorkoutContent.dayIndex;
        } else {
            i13 = i11;
        }
        if ((i12 & 4) != 0) {
            str8 = wsWorkoutContent.title;
        } else {
            str8 = str2;
        }
        if ((i12 & 8) != 0) {
            str9 = wsWorkoutContent.contextualizedDescription;
        } else {
            str9 = str3;
        }
        if ((i12 & 16) != 0) {
            str10 = wsWorkoutContent.featureImage;
        } else {
            str10 = str4;
        }
        if ((i12 & 32) != 0) {
            list4 = wsWorkoutContent.tags;
        } else {
            list4 = list;
        }
        if ((i12 & 64) != 0) {
            list5 = wsWorkoutContent.prepareItems;
        } else {
            list5 = list2;
        }
        if ((i12 & 128) != 0) {
            str11 = wsWorkoutContent.video;
        } else {
            str11 = str5;
        }
        if ((i12 & 256) != 0) {
            str12 = wsWorkoutContent.hlsVideo;
        } else {
            str12 = str6;
        }
        if ((i12 & 512) != 0) {
            list6 = wsWorkoutContent.recommendedDevices;
        } else {
            list6 = list3;
        }
        if ((i12 & 1024) != 0) {
            wsContextualized2 = wsWorkoutContent.contextualized;
        } else {
            wsContextualized2 = wsContextualized;
        }
        return wsWorkoutContent.copy(str7, i13, str8, str9, str10, list4, list5, str11, str12, list6, wsContextualized2);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(WsWorkoutContent wsWorkoutContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        WsContent.write$Self(wsWorkoutContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsWorkoutContent.identifier);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, wsWorkoutContent.dayIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsWorkoutContent.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, wsWorkoutContent.contextualizedDescription);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, wsWorkoutContent.featureImage);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], wsWorkoutContent.tags);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], wsWorkoutContent.prepareItems);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, wsWorkoutContent.video);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, wsWorkoutContent.hlsVideo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], wsWorkoutContent.recommendedDevices);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, WsContextualized$$serializer.INSTANCE, wsWorkoutContent.contextualized);
    }

    public final String component1() {
        return this.identifier;
    }

    public final List<WsRecommendedDevice> component10() {
        return this.recommendedDevices;
    }

    public final WsContextualized component11() {
        return this.contextualized;
    }

    public final int component2() {
        return this.dayIndex;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.contextualizedDescription;
    }

    public final String component5() {
        return this.featureImage;
    }

    public final List<WsTag> component6() {
        return this.tags;
    }

    public final List<WsRecommendedEquipment> component7() {
        return this.prepareItems;
    }

    public final String component8() {
        return this.video;
    }

    public final String component9() {
        return this.hlsVideo;
    }

    public final WsWorkoutContent copy(String identifier, int i11, String title, String str, String featureImage, List<WsTag> tags, List<WsRecommendedEquipment> prepareItems, String video, String str2, List<WsRecommendedDevice> recommendedDevices, WsContextualized wsContextualized) {
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(prepareItems, "prepareItems");
        u.j(video, "video");
        u.j(recommendedDevices, "recommendedDevices");
        return new WsWorkoutContent(identifier, i11, title, str, featureImage, tags, prepareItems, video, str2, recommendedDevices, wsContextualized);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsWorkoutContent)) {
            return false;
        }
        WsWorkoutContent wsWorkoutContent = (WsWorkoutContent) obj;
        if (u.e(this.identifier, wsWorkoutContent.identifier) && this.dayIndex == wsWorkoutContent.dayIndex && u.e(this.title, wsWorkoutContent.title) && u.e(this.contextualizedDescription, wsWorkoutContent.contextualizedDescription) && u.e(this.featureImage, wsWorkoutContent.featureImage) && u.e(this.tags, wsWorkoutContent.tags) && u.e(this.prepareItems, wsWorkoutContent.prepareItems) && u.e(this.video, wsWorkoutContent.video) && u.e(this.hlsVideo, wsWorkoutContent.hlsVideo) && u.e(this.recommendedDevices, wsWorkoutContent.recommendedDevices) && u.e(this.contextualized, wsWorkoutContent.contextualized)) {
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

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getHlsVideo() {
        return this.hlsVideo;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final List<WsRecommendedEquipment> getPrepareItems() {
        return this.prepareItems;
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

    public final String getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int c11 = d.c(this.title, h.a(this.dayIndex, this.identifier.hashCode() * 31, 31), 31);
        String str = this.contextualizedDescription;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c12 = d.c(this.video, e.b(this.prepareItems, e.b(this.tags, d.c(this.featureImage, (c11 + hashCode) * 31, 31), 31), 31), 31);
        String str2 = this.hlsVideo;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int b10 = e.b(this.recommendedDevices, (c12 + hashCode2) * 31, 31);
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized != null) {
            i11 = wsContextualized.hashCode();
        }
        return b10 + i11;
    }

    public String toString() {
        String str = this.identifier;
        int i11 = this.dayIndex;
        String str2 = this.title;
        String str3 = this.contextualizedDescription;
        String str4 = this.featureImage;
        List<WsTag> list = this.tags;
        List<WsRecommendedEquipment> list2 = this.prepareItems;
        String str5 = this.video;
        String str6 = this.hlsVideo;
        List<WsRecommendedDevice> list3 = this.recommendedDevices;
        WsContextualized wsContextualized = this.contextualized;
        StringBuilder b10 = g.b("WsWorkoutContent(identifier=", str, ", dayIndex=", i11, ", title=");
        b.d(b10, str2, ", contextualizedDescription=", str3, ", featureImage=");
        c.d(b10, str4, ", tags=", list, ", prepareItems=");
        b10.append(list2);
        b10.append(", video=");
        b10.append(str5);
        b10.append(", hlsVideo=");
        c.d(b10, str6, ", recommendedDevices=", list3, ", contextualized=");
        b10.append(wsContextualized);
        b10.append(")");
        return b10.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsWorkoutContent(String identifier, int i11, String title, String str, String featureImage, List<WsTag> tags, List<WsRecommendedEquipment> prepareItems, String video, String str2, List<WsRecommendedDevice> recommendedDevices, WsContextualized wsContextualized) {
        super(null);
        u.j(identifier, "identifier");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(prepareItems, "prepareItems");
        u.j(video, "video");
        u.j(recommendedDevices, "recommendedDevices");
        this.identifier = identifier;
        this.dayIndex = i11;
        this.title = title;
        this.contextualizedDescription = str;
        this.featureImage = featureImage;
        this.tags = tags;
        this.prepareItems = prepareItems;
        this.video = video;
        this.hlsVideo = str2;
        this.recommendedDevices = recommendedDevices;
        this.contextualized = wsContextualized;
    }

    @Override // com.withings.contentproviders.eightfit.model.webservice.WsContent
    public EightFitWorkoutContent toEightFit() {
        String str;
        String str2 = this.identifier;
        ArrayList d11 = c.d(this.tags);
        String str3 = this.title;
        String str4 = this.featureImage;
        WsContextualized wsContextualized = this.contextualized;
        if (wsContextualized == null || (str = wsContextualized.getDescription()) == null) {
            str = this.contextualizedDescription;
        }
        String str5 = str;
        List<WsRecommendedEquipment> list = this.prepareItems;
        u.j(list, "<this>");
        List<WsRecommendedEquipment> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (WsRecommendedEquipment wsRecommendedEquipment : list2) {
            arrayList.add(new EightFitContent.EightFitRecommendedEquipment(wsRecommendedEquipment.getLabel(), wsRecommendedEquipment.getIconId(), wsRecommendedEquipment.getRequired()));
        }
        return new EightFitWorkoutContent(str2, d11, str3, str5, str4, arrayList, this.video, this.hlsVideo, b.c(this.recommendedDevices));
    }
}
