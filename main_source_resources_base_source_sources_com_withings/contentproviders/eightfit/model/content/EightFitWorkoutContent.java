package com.withings.contentproviders.eightfit.model.content;

import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.content.EightFitContent;
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
/* compiled from: EightFitWorkoutContent.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Be\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000e\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e¢\u0006\u0004\b:\u0010;B\u0087\u0001\b\u0011\u0012\u0006\u0010<\u001a\u00020'\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000e\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\rJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0011J\u0080\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\b\b\u0002\u0010!\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010\rJ\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u001b\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b0\u0010\rR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b3\u0010\rR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b4\u0010\rR\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b5\u0010\rR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0006¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b6\u0010\u0011R\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b7\u0010\rR\u0019\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b8\u0010\rR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e8\u0006¢\u0006\f\n\u0004\b#\u00101\u001a\u0004\b9\u0010\u0011¨\u0006B"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedEquipment;", "component6", "component7", "component8", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "component9", "identifier", "tags", "title", HealthConstants.FoodInfo.DESCRIPTION, "featureImage", "prepareItems", "video", "hlsVideo", "recommendedDevices", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Ljava/util/List;", "getTags", "getTitle", "getDescription", "getFeatureImage", "getPrepareItems", "getVideo", "getHlsVideo", "getRecommendedDevices", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class EightFitWorkoutContent extends EightFitContent {
    private final String description;
    private final String featureImage;
    private final String hlsVideo;
    private final String identifier;
    private final List<EightFitContent.EightFitRecommendedEquipment> prepareItems;
    private final List<EightFitContent.EightFitRecommendedDevice> recommendedDevices;
    private final List<EightFitContent.EightFitTag> tags;
    private final String title;
    private final String video;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(EightFitContent$EightFitRecommendedEquipment$$serializer.INSTANCE), null, null, new ArrayListSerializer(EightFitContent$EightFitRecommendedDevice$$serializer.INSTANCE)};

    /* compiled from: EightFitWorkoutContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitWorkoutContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EightFitWorkoutContent> serializer() {
            return EightFitWorkoutContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EightFitWorkoutContent(int i11, String str, List list, String str2, String str3, String str4, List list2, String str5, String str6, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (511 != (i11 & 511)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 511, EightFitWorkoutContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.tags = list;
        this.title = str2;
        this.description = str3;
        this.featureImage = str4;
        this.prepareItems = list2;
        this.video = str5;
        this.hlsVideo = str6;
        this.recommendedDevices = list3;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EightFitWorkoutContent copy$default(EightFitWorkoutContent eightFitWorkoutContent, String str, List list, String str2, String str3, String str4, List list2, String str5, String str6, List list3, int i11, Object obj) {
        String str7;
        List<EightFitContent.EightFitTag> list4;
        String str8;
        String str9;
        String str10;
        List<EightFitContent.EightFitRecommendedEquipment> list5;
        String str11;
        String str12;
        List<EightFitContent.EightFitRecommendedDevice> list6;
        if ((i11 & 1) != 0) {
            str7 = eightFitWorkoutContent.identifier;
        } else {
            str7 = str;
        }
        if ((i11 & 2) != 0) {
            list4 = eightFitWorkoutContent.tags;
        } else {
            list4 = list;
        }
        if ((i11 & 4) != 0) {
            str8 = eightFitWorkoutContent.title;
        } else {
            str8 = str2;
        }
        if ((i11 & 8) != 0) {
            str9 = eightFitWorkoutContent.description;
        } else {
            str9 = str3;
        }
        if ((i11 & 16) != 0) {
            str10 = eightFitWorkoutContent.featureImage;
        } else {
            str10 = str4;
        }
        if ((i11 & 32) != 0) {
            list5 = eightFitWorkoutContent.prepareItems;
        } else {
            list5 = list2;
        }
        if ((i11 & 64) != 0) {
            str11 = eightFitWorkoutContent.video;
        } else {
            str11 = str5;
        }
        if ((i11 & 128) != 0) {
            str12 = eightFitWorkoutContent.hlsVideo;
        } else {
            str12 = str6;
        }
        if ((i11 & 256) != 0) {
            list6 = eightFitWorkoutContent.recommendedDevices;
        } else {
            list6 = list3;
        }
        return eightFitWorkoutContent.copy(str7, list4, str8, str9, str10, list5, str11, str12, list6);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(EightFitWorkoutContent eightFitWorkoutContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EightFitContent.write$Self(eightFitWorkoutContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitWorkoutContent.getIdentifier());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eightFitWorkoutContent.getTags());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eightFitWorkoutContent.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, eightFitWorkoutContent.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eightFitWorkoutContent.featureImage);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], eightFitWorkoutContent.prepareItems);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, eightFitWorkoutContent.video);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, eightFitWorkoutContent.hlsVideo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], eightFitWorkoutContent.recommendedDevices);
    }

    public final String component1() {
        return this.identifier;
    }

    public final List<EightFitContent.EightFitTag> component2() {
        return this.tags;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.featureImage;
    }

    public final List<EightFitContent.EightFitRecommendedEquipment> component6() {
        return this.prepareItems;
    }

    public final String component7() {
        return this.video;
    }

    public final String component8() {
        return this.hlsVideo;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> component9() {
        return this.recommendedDevices;
    }

    public final EightFitWorkoutContent copy(String identifier, List<EightFitContent.EightFitTag> tags, String title, String str, String featureImage, List<EightFitContent.EightFitRecommendedEquipment> prepareItems, String video, String str2, List<EightFitContent.EightFitRecommendedDevice> recommendedDevices) {
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(prepareItems, "prepareItems");
        u.j(video, "video");
        u.j(recommendedDevices, "recommendedDevices");
        return new EightFitWorkoutContent(identifier, tags, title, str, featureImage, prepareItems, video, str2, recommendedDevices);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EightFitWorkoutContent)) {
            return false;
        }
        EightFitWorkoutContent eightFitWorkoutContent = (EightFitWorkoutContent) obj;
        if (u.e(this.identifier, eightFitWorkoutContent.identifier) && u.e(this.tags, eightFitWorkoutContent.tags) && u.e(this.title, eightFitWorkoutContent.title) && u.e(this.description, eightFitWorkoutContent.description) && u.e(this.featureImage, eightFitWorkoutContent.featureImage) && u.e(this.prepareItems, eightFitWorkoutContent.prepareItems) && u.e(this.video, eightFitWorkoutContent.video) && u.e(this.hlsVideo, eightFitWorkoutContent.hlsVideo) && u.e(this.recommendedDevices, eightFitWorkoutContent.recommendedDevices)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFeatureImage() {
        return this.featureImage;
    }

    public final String getHlsVideo() {
        return this.hlsVideo;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public String getIdentifier() {
        return this.identifier;
    }

    public final List<EightFitContent.EightFitRecommendedEquipment> getPrepareItems() {
        return this.prepareItems;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> getRecommendedDevices() {
        return this.recommendedDevices;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public List<EightFitContent.EightFitTag> getTags() {
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
        int c11 = d.c(this.title, e.b(this.tags, this.identifier.hashCode() * 31, 31), 31);
        String str = this.description;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c12 = d.c(this.video, e.b(this.prepareItems, d.c(this.featureImage, (c11 + hashCode) * 31, 31), 31), 31);
        String str2 = this.hlsVideo;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.recommendedDevices.hashCode() + ((c12 + i11) * 31);
    }

    public String toString() {
        String str = this.identifier;
        List<EightFitContent.EightFitTag> list = this.tags;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.featureImage;
        List<EightFitContent.EightFitRecommendedEquipment> list2 = this.prepareItems;
        String str5 = this.video;
        String str6 = this.hlsVideo;
        List<EightFitContent.EightFitRecommendedDevice> list3 = this.recommendedDevices;
        StringBuilder sb2 = new StringBuilder("EightFitWorkoutContent(identifier=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", title=");
        b.d(sb2, str2, ", description=", str3, ", featureImage=");
        c.d(sb2, str4, ", prepareItems=", list2, ", video=");
        b.d(sb2, str5, ", hlsVideo=", str6, ", recommendedDevices=");
        return d.i(sb2, list3, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EightFitWorkoutContent(String identifier, List<EightFitContent.EightFitTag> tags, String title, String str, String featureImage, List<EightFitContent.EightFitRecommendedEquipment> prepareItems, String video, String str2, List<EightFitContent.EightFitRecommendedDevice> recommendedDevices) {
        super(null);
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(title, "title");
        u.j(featureImage, "featureImage");
        u.j(prepareItems, "prepareItems");
        u.j(video, "video");
        u.j(recommendedDevices, "recommendedDevices");
        this.identifier = identifier;
        this.tags = tags;
        this.title = title;
        this.description = str;
        this.featureImage = featureImage;
        this.prepareItems = prepareItems;
        this.video = video;
        this.hlsVideo = str2;
        this.recommendedDevices = recommendedDevices;
    }
}
