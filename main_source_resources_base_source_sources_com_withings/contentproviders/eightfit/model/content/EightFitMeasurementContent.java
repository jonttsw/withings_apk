package com.withings.contentproviders.eightfit.model.content;

import androidx.appcompat.app.h;
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
/* compiled from: EightFitMeasurementContent.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B_\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\u0006\u0010#\u001a\u00020\u0017\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e¢\u0006\u0004\b:\u0010;B\u007f\b\u0011\u0012\u0006\u0010<\u001a\u00020\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010#\u001a\u00020\u0017\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000e\u0012\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b:\u0010?J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jz\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u00172\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\rJ\u0010\u0010(\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\b/\u0010\rR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b1\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b2\u0010\rR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b3\u0010\rR\u0017\u0010 \u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b4\u0010\rR\u0019\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b5\u0010\rR\u0017\u0010\"\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b6\u0010\rR\u0017\u0010#\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b8\u0010\u0019R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b9\u0010\u0011¨\u0006B"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$eightfit_release", "(Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "()Ljava/lang/String;", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "", "component8", "()I", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "component9", "identifier", "tags", "titleWithDevice", "contextualizeDescriptionWithDevice", "titleForManual", "contextualizeDescriptionForManual", "featureImage", "measureType", "recommendedDevice", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Ljava/util/List;", "getTags", "getTitleWithDevice", "getContextualizeDescriptionWithDevice", "getTitleForManual", "getContextualizeDescriptionForManual", "getFeatureImage", "I", "getMeasureType", "getRecommendedDevice", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "eightfit_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes3.dex */
public final class EightFitMeasurementContent extends EightFitContent {
    private final String contextualizeDescriptionForManual;
    private final String contextualizeDescriptionWithDevice;
    private final String featureImage;
    private final String identifier;
    private final int measureType;
    private final List<EightFitContent.EightFitRecommendedDevice> recommendedDevice;
    private final List<EightFitContent.EightFitTag> tags;
    private final String titleForManual;
    private final String titleWithDevice;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(EightFitContent$EightFitRecommendedDevice$$serializer.INSTANCE)};

    /* compiled from: EightFitMeasurementContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<EightFitMeasurementContent> serializer() {
            return EightFitMeasurementContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EightFitMeasurementContent(int i11, String str, List list, String str2, String str3, String str4, String str5, String str6, int i12, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i11, serializationConstructorMarker);
        if (511 != (i11 & 511)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 511, EightFitMeasurementContent$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.tags = list;
        this.titleWithDevice = str2;
        this.contextualizeDescriptionWithDevice = str3;
        this.titleForManual = str4;
        this.contextualizeDescriptionForManual = str5;
        this.featureImage = str6;
        this.measureType = i12;
        this.recommendedDevice = list2;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EightFitMeasurementContent copy$default(EightFitMeasurementContent eightFitMeasurementContent, String str, List list, String str2, String str3, String str4, String str5, String str6, int i11, List list2, int i12, Object obj) {
        String str7;
        List<EightFitContent.EightFitTag> list3;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i13;
        List<EightFitContent.EightFitRecommendedDevice> list4;
        if ((i12 & 1) != 0) {
            str7 = eightFitMeasurementContent.identifier;
        } else {
            str7 = str;
        }
        if ((i12 & 2) != 0) {
            list3 = eightFitMeasurementContent.tags;
        } else {
            list3 = list;
        }
        if ((i12 & 4) != 0) {
            str8 = eightFitMeasurementContent.titleWithDevice;
        } else {
            str8 = str2;
        }
        if ((i12 & 8) != 0) {
            str9 = eightFitMeasurementContent.contextualizeDescriptionWithDevice;
        } else {
            str9 = str3;
        }
        if ((i12 & 16) != 0) {
            str10 = eightFitMeasurementContent.titleForManual;
        } else {
            str10 = str4;
        }
        if ((i12 & 32) != 0) {
            str11 = eightFitMeasurementContent.contextualizeDescriptionForManual;
        } else {
            str11 = str5;
        }
        if ((i12 & 64) != 0) {
            str12 = eightFitMeasurementContent.featureImage;
        } else {
            str12 = str6;
        }
        if ((i12 & 128) != 0) {
            i13 = eightFitMeasurementContent.measureType;
        } else {
            i13 = i11;
        }
        if ((i12 & 256) != 0) {
            list4 = eightFitMeasurementContent.recommendedDevice;
        } else {
            list4 = list2;
        }
        return eightFitMeasurementContent.copy(str7, list3, str8, str9, str10, str11, str12, i13, list4);
    }

    public static final /* synthetic */ void write$Self$eightfit_release(EightFitMeasurementContent eightFitMeasurementContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        EightFitContent.write$Self(eightFitMeasurementContent, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eightFitMeasurementContent.getIdentifier());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], eightFitMeasurementContent.getTags());
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eightFitMeasurementContent.titleWithDevice);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, eightFitMeasurementContent.contextualizeDescriptionWithDevice);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eightFitMeasurementContent.titleForManual);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, eightFitMeasurementContent.contextualizeDescriptionForManual);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, eightFitMeasurementContent.featureImage);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, eightFitMeasurementContent.measureType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], eightFitMeasurementContent.recommendedDevice);
    }

    public final String component1() {
        return this.identifier;
    }

    public final List<EightFitContent.EightFitTag> component2() {
        return this.tags;
    }

    public final String component3() {
        return this.titleWithDevice;
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

    public final int component8() {
        return this.measureType;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> component9() {
        return this.recommendedDevice;
    }

    public final EightFitMeasurementContent copy(String identifier, List<EightFitContent.EightFitTag> tags, String titleWithDevice, String str, String titleForManual, String str2, String featureImage, int i11, List<EightFitContent.EightFitRecommendedDevice> recommendedDevice) {
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(titleWithDevice, "titleWithDevice");
        u.j(titleForManual, "titleForManual");
        u.j(featureImage, "featureImage");
        u.j(recommendedDevice, "recommendedDevice");
        return new EightFitMeasurementContent(identifier, tags, titleWithDevice, str, titleForManual, str2, featureImage, i11, recommendedDevice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EightFitMeasurementContent)) {
            return false;
        }
        EightFitMeasurementContent eightFitMeasurementContent = (EightFitMeasurementContent) obj;
        if (u.e(this.identifier, eightFitMeasurementContent.identifier) && u.e(this.tags, eightFitMeasurementContent.tags) && u.e(this.titleWithDevice, eightFitMeasurementContent.titleWithDevice) && u.e(this.contextualizeDescriptionWithDevice, eightFitMeasurementContent.contextualizeDescriptionWithDevice) && u.e(this.titleForManual, eightFitMeasurementContent.titleForManual) && u.e(this.contextualizeDescriptionForManual, eightFitMeasurementContent.contextualizeDescriptionForManual) && u.e(this.featureImage, eightFitMeasurementContent.featureImage) && this.measureType == eightFitMeasurementContent.measureType && u.e(this.recommendedDevice, eightFitMeasurementContent.recommendedDevice)) {
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

    public final String getFeatureImage() {
        return this.featureImage;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public String getIdentifier() {
        return this.identifier;
    }

    public final int getMeasureType() {
        return this.measureType;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> getRecommendedDevice() {
        return this.recommendedDevice;
    }

    @Override // com.withings.contentproviders.eightfit.model.content.EightFitContent
    public List<EightFitContent.EightFitTag> getTags() {
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
        int c11 = d.c(this.titleWithDevice, e.b(this.tags, this.identifier.hashCode() * 31, 31), 31);
        String str = this.contextualizeDescriptionWithDevice;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c12 = d.c(this.titleForManual, (c11 + hashCode) * 31, 31);
        String str2 = this.contextualizeDescriptionForManual;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.recommendedDevice.hashCode() + h.a(this.measureType, d.c(this.featureImage, (c12 + i11) * 31, 31), 31);
    }

    public String toString() {
        String str = this.identifier;
        List<EightFitContent.EightFitTag> list = this.tags;
        String str2 = this.titleWithDevice;
        String str3 = this.contextualizeDescriptionWithDevice;
        String str4 = this.titleForManual;
        String str5 = this.contextualizeDescriptionForManual;
        String str6 = this.featureImage;
        int i11 = this.measureType;
        List<EightFitContent.EightFitRecommendedDevice> list2 = this.recommendedDevice;
        StringBuilder sb2 = new StringBuilder("EightFitMeasurementContent(identifier=");
        sb2.append(str);
        sb2.append(", tags=");
        sb2.append(list);
        sb2.append(", titleWithDevice=");
        b.d(sb2, str2, ", contextualizeDescriptionWithDevice=", str3, ", titleForManual=");
        b.d(sb2, str4, ", contextualizeDescriptionForManual=", str5, ", featureImage=");
        sb2.append(str6);
        sb2.append(", measureType=");
        sb2.append(i11);
        sb2.append(", recommendedDevice=");
        return d.i(sb2, list2, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EightFitMeasurementContent(String identifier, List<EightFitContent.EightFitTag> tags, String titleWithDevice, String str, String titleForManual, String str2, String featureImage, int i11, List<EightFitContent.EightFitRecommendedDevice> recommendedDevice) {
        super(null);
        u.j(identifier, "identifier");
        u.j(tags, "tags");
        u.j(titleWithDevice, "titleWithDevice");
        u.j(titleForManual, "titleForManual");
        u.j(featureImage, "featureImage");
        u.j(recommendedDevice, "recommendedDevice");
        this.identifier = identifier;
        this.tags = tags;
        this.titleWithDevice = titleWithDevice;
        this.contextualizeDescriptionWithDevice = str;
        this.titleForManual = titleForManual;
        this.contextualizeDescriptionForManual = str2;
        this.featureImage = featureImage;
        this.measureType = i11;
        this.recommendedDevice = recommendedDevice;
    }
}
