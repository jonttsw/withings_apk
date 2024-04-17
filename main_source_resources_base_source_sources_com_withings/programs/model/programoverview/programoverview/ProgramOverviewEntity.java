package com.withings.programs.model.programoverview.programoverview;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.contentproviders.eightfit.model.content.EightFitContent;
import com.withings.contentproviders.eightfit.model.content.EightFitContent$EightFitRecommendedDevice$$serializer;
import com.withings.contentproviders.eightfit.model.content.EightFitContent$EightFitTag$$serializer;
import com.withings.contentproviders.eightfit.model.webservice.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.programoverview.programoverviewcontent.ProgramOverviewContentEntity;
import com.withings.programs.model.programoverview.programoverviewcontent.ProgramOverviewContentEntity$$serializer;
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
/* compiled from: ProgramOverviewEntity.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBu\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0014¢\u0006\u0004\b>\u0010?B\u008d\u0001\b\u0011\u0012\u0006\u0010@\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u0014\u0012\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\b>\u0010CJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u008a\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0004J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J(\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+HÁ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\b2\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b3\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b4\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b5\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b\u001b\u0010\nR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b8\u0010\u000eR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b9\u0010\u000eR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b:\u0010\u000eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b;\u0010\u0004R\u001a\u0010 \u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010<\u001a\u0004\b=\u0010\u0016¨\u0006F"}, d2 = {"Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "component5", "()Z", "", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitTag;", "component6", "()Ljava/util/List;", "Lcom/withings/programs/model/programoverview/programoverviewcontent/ProgramOverviewContentEntity;", "component7", "Lcom/withings/contentproviders/eightfit/model/content/EightFitContent$EightFitRecommendedDevice;", "component8", "component9", "", "component10", "()I", "identifier", "title", HealthConstants.FoodInfo.DESCRIPTION, "featureImage", "isNew", "tags", "contentTypePreview", "recommendedDevices", "deviceDescription", "accessLevel", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getIdentifier", "getTitle", "getDescription", "getFeatureImage", "Z", "Ljava/util/List;", "getTags", "getContentTypePreview", "getRecommendedDevices", "getDeviceDescription", "I", "getAccessLevel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class ProgramOverviewEntity {
    @SerializedName("accessLevel")
    private final int accessLevel;
    @SerializedName("contentTypePreview")
    private final List<ProgramOverviewContentEntity> contentTypePreview;
    @SerializedName(HealthConstants.FoodInfo.DESCRIPTION)
    private final String description;
    @SerializedName("deviceDescription")
    private final String deviceDescription;
    @SerializedName("featureImage")
    private final String featureImage;
    @SerializedName("identifier")
    private final String identifier;
    private final boolean isNew;
    @SerializedName("recommendedDevices")
    private final List<EightFitContent.EightFitRecommendedDevice> recommendedDevices;
    @SerializedName("tags")
    private final List<EightFitContent.EightFitTag> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(EightFitContent$EightFitTag$$serializer.INSTANCE), new ArrayListSerializer(ProgramOverviewContentEntity$$serializer.INSTANCE), new ArrayListSerializer(EightFitContent$EightFitRecommendedDevice$$serializer.INSTANCE), null, null};

    /* compiled from: ProgramOverviewEntity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/programoverview/programoverview/ProgramOverviewEntity;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<ProgramOverviewEntity> serializer() {
            return ProgramOverviewEntity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgramOverviewEntity(int i11, String str, String str2, String str3, String str4, boolean z5, List list, List list2, List list3, String str5, int i12, SerializationConstructorMarker serializationConstructorMarker) {
        if (238 != (i11 & ConstantsWs.WS_STATUS_WRONGACCOUNTID)) {
            PluginExceptionsKt.throwMissingFieldException(i11, ConstantsWs.WS_STATUS_WRONGACCOUNTID, ProgramOverviewEntity$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.identifier = null;
        } else {
            this.identifier = str;
        }
        this.title = str2;
        this.description = str3;
        this.featureImage = str4;
        if ((i11 & 16) == 0) {
            this.isNew = true;
        } else {
            this.isNew = z5;
        }
        this.tags = list;
        this.contentTypePreview = list2;
        this.recommendedDevices = list3;
        if ((i11 & 256) == 0) {
            this.deviceDescription = null;
        } else {
            this.deviceDescription = str5;
        }
        if ((i11 & 512) == 0) {
            this.accessLevel = 0;
        } else {
            this.accessLevel = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgramOverviewEntity copy$default(ProgramOverviewEntity programOverviewEntity, String str, String str2, String str3, String str4, boolean z5, List list, List list2, List list3, String str5, int i11, int i12, Object obj) {
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z11;
        List<EightFitContent.EightFitTag> list4;
        List<ProgramOverviewContentEntity> list5;
        List<EightFitContent.EightFitRecommendedDevice> list6;
        String str10;
        int i13;
        if ((i12 & 1) != 0) {
            str6 = programOverviewEntity.identifier;
        } else {
            str6 = str;
        }
        if ((i12 & 2) != 0) {
            str7 = programOverviewEntity.title;
        } else {
            str7 = str2;
        }
        if ((i12 & 4) != 0) {
            str8 = programOverviewEntity.description;
        } else {
            str8 = str3;
        }
        if ((i12 & 8) != 0) {
            str9 = programOverviewEntity.featureImage;
        } else {
            str9 = str4;
        }
        if ((i12 & 16) != 0) {
            z11 = programOverviewEntity.isNew;
        } else {
            z11 = z5;
        }
        if ((i12 & 32) != 0) {
            list4 = programOverviewEntity.tags;
        } else {
            list4 = list;
        }
        if ((i12 & 64) != 0) {
            list5 = programOverviewEntity.contentTypePreview;
        } else {
            list5 = list2;
        }
        if ((i12 & 128) != 0) {
            list6 = programOverviewEntity.recommendedDevices;
        } else {
            list6 = list3;
        }
        if ((i12 & 256) != 0) {
            str10 = programOverviewEntity.deviceDescription;
        } else {
            str10 = str5;
        }
        if ((i12 & 512) != 0) {
            i13 = programOverviewEntity.accessLevel;
        } else {
            i13 = i11;
        }
        return programOverviewEntity.copy(str6, str7, str8, str9, z11, list4, list5, list6, str10, i13);
    }

    public static final /* synthetic */ void write$Self$android_release(ProgramOverviewEntity programOverviewEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || programOverviewEntity.identifier != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, programOverviewEntity.identifier);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, programOverviewEntity.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, programOverviewEntity.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, programOverviewEntity.featureImage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !programOverviewEntity.isNew) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, programOverviewEntity.isNew);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], programOverviewEntity.tags);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], programOverviewEntity.contentTypePreview);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], programOverviewEntity.recommendedDevices);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || programOverviewEntity.deviceDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, programOverviewEntity.deviceDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || programOverviewEntity.accessLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, programOverviewEntity.accessLevel);
        }
    }

    public final String component1() {
        return this.identifier;
    }

    public final int component10() {
        return this.accessLevel;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.featureImage;
    }

    public final boolean component5() {
        return this.isNew;
    }

    public final List<EightFitContent.EightFitTag> component6() {
        return this.tags;
    }

    public final List<ProgramOverviewContentEntity> component7() {
        return this.contentTypePreview;
    }

    public final List<EightFitContent.EightFitRecommendedDevice> component8() {
        return this.recommendedDevices;
    }

    public final String component9() {
        return this.deviceDescription;
    }

    public final ProgramOverviewEntity copy(String str, String title, String description, String featureImage, boolean z5, List<EightFitContent.EightFitTag> tags, List<ProgramOverviewContentEntity> contentTypePreview, List<EightFitContent.EightFitRecommendedDevice> recommendedDevices, String str2, int i11) {
        u.j(title, "title");
        u.j(description, "description");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(contentTypePreview, "contentTypePreview");
        u.j(recommendedDevices, "recommendedDevices");
        return new ProgramOverviewEntity(str, title, description, featureImage, z5, tags, contentTypePreview, recommendedDevices, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramOverviewEntity)) {
            return false;
        }
        ProgramOverviewEntity programOverviewEntity = (ProgramOverviewEntity) obj;
        if (u.e(this.identifier, programOverviewEntity.identifier) && u.e(this.title, programOverviewEntity.title) && u.e(this.description, programOverviewEntity.description) && u.e(this.featureImage, programOverviewEntity.featureImage) && this.isNew == programOverviewEntity.isNew && u.e(this.tags, programOverviewEntity.tags) && u.e(this.contentTypePreview, programOverviewEntity.contentTypePreview) && u.e(this.recommendedDevices, programOverviewEntity.recommendedDevices) && u.e(this.deviceDescription, programOverviewEntity.deviceDescription) && this.accessLevel == programOverviewEntity.accessLevel) {
            return true;
        }
        return false;
    }

    public final int getAccessLevel() {
        return this.accessLevel;
    }

    public final List<ProgramOverviewContentEntity> getContentTypePreview() {
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

    public final List<EightFitContent.EightFitRecommendedDevice> getRecommendedDevices() {
        return this.recommendedDevices;
    }

    public final List<EightFitContent.EightFitTag> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        String str = this.identifier;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b10 = e.b(this.recommendedDevices, e.b(this.contentTypePreview, e.b(this.tags, y1.a(this.isNew, d.c(this.featureImage, d.c(this.description, d.c(this.title, hashCode * 31, 31), 31), 31), 31), 31), 31), 31);
        String str2 = this.deviceDescription;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Integer.hashCode(this.accessLevel) + ((b10 + i11) * 31);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.featureImage;
        boolean z5 = this.isNew;
        List<EightFitContent.EightFitTag> list = this.tags;
        List<ProgramOverviewContentEntity> list2 = this.contentTypePreview;
        List<EightFitContent.EightFitRecommendedDevice> list3 = this.recommendedDevices;
        String str5 = this.deviceDescription;
        int i11 = this.accessLevel;
        StringBuilder b10 = l0.b("ProgramOverviewEntity(identifier=", str, ", title=", str2, ", description=");
        b.d(b10, str3, ", featureImage=", str4, ", isNew=");
        b10.append(z5);
        b10.append(", tags=");
        b10.append(list);
        b10.append(", contentTypePreview=");
        a.a(b10, list2, ", recommendedDevices=", list3, ", deviceDescription=");
        b10.append(str5);
        b10.append(", accessLevel=");
        b10.append(i11);
        b10.append(")");
        return b10.toString();
    }

    public ProgramOverviewEntity(String str, String title, String description, String featureImage, boolean z5, List<EightFitContent.EightFitTag> tags, List<ProgramOverviewContentEntity> contentTypePreview, List<EightFitContent.EightFitRecommendedDevice> recommendedDevices, String str2, int i11) {
        u.j(title, "title");
        u.j(description, "description");
        u.j(featureImage, "featureImage");
        u.j(tags, "tags");
        u.j(contentTypePreview, "contentTypePreview");
        u.j(recommendedDevices, "recommendedDevices");
        this.identifier = str;
        this.title = title;
        this.description = description;
        this.featureImage = featureImage;
        this.isNew = z5;
        this.tags = tags;
        this.contentTypePreview = contentTypePreview;
        this.recommendedDevices = recommendedDevices;
        this.deviceDescription = str2;
        this.accessLevel = i11;
    }

    public /* synthetic */ ProgramOverviewEntity(String str, String str2, String str3, String str4, boolean z5, List list, List list2, List list3, String str5, int i11, int i12, m mVar) {
        this((i12 & 1) != 0 ? null : str, str2, str3, str4, (i12 & 16) != 0 ? true : z5, list, list2, list3, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? 0 : i11);
    }
}
