package com.withings.programs.model.webservice.wellnessPrograms;

import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.contentproviders.eightfit.model.webservice.a;
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
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WsSpecifics.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONB\u008b\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\bH\u0010IB«\u0001\b\u0011\u0012\u0006\u0010J\u001a\u00020(\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r\u0012\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bH\u0010MJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000fJ¦\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\n2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0004J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J(\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202HÁ\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\b:\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b;\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b<\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b=\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b>\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010?\u001a\u0004\b@\u0010\fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bB\u0010\u000fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010A\u001a\u0004\bC\u0010\u000fR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bD\u0010\u000fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010E\u001a\u0004\bF\u0010\u0016R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010A\u001a\u0004\bG\u0010\u000f¨\u0006P"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsStyle;", "component7", "()Lcom/withings/programs/model/webservice/wellnessPrograms/WsStyle;", "", "component8", "()Ljava/util/List;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsFeature;", "component9", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsScreenshot;", "component10", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsSponsors;", "component11", "()Lcom/withings/programs/model/webservice/wellnessPrograms/WsSponsors;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsDevice;", "component12", "title", "about", "subtitle", "cta", "imageFull", "imagePreview", XHTMLText.STYLE, "tags", "features", "screenshots", "sponsors", "devices", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/webservice/wellnessPrograms/WsStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSponsors;Ljava/util/List;)Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self$android_release", "(Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTitle", "getAbout", "getSubtitle", "getCta", "getImageFull", "getImagePreview", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsStyle;", "getStyle", "Ljava/util/List;", "getTags", "getFeatures", "getScreenshots", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsSponsors;", "getSponsors", "getDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/webservice/wellnessPrograms/WsStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSponsors;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/programs/model/webservice/wellnessPrograms/WsStyle;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSponsors;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "android_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class WsSpecifics {
    @SerializedName("about")
    private final String about;
    @SerializedName("cta")
    private final String cta;
    @SerializedName("devices")
    private final List<WsDevice> devices;
    @SerializedName("features")
    private final List<WsFeature> features;
    @SerializedName("image_full")
    private final String imageFull;
    @SerializedName("image_preview")
    private final String imagePreview;
    @SerializedName("screenshots")
    private final List<WsScreenshot> screenshots;
    @SerializedName("sponsors")
    private final WsSponsors sponsors;
    @SerializedName(XHTMLText.STYLE)
    private final WsStyle style;
    @SerializedName("subtitle")
    private final String subtitle;
    @SerializedName("tags")
    private final List<String> tags;
    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), new ArrayListSerializer(WsFeature$$serializer.INSTANCE), new ArrayListSerializer(WsScreenshot$$serializer.INSTANCE), null, new ArrayListSerializer(WsDevice$$serializer.INSTANCE)};

    /* compiled from: WsSpecifics.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<WsSpecifics> serializer() {
            return WsSpecifics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WsSpecifics(int i11, String str, String str2, String str3, String str4, String str5, String str6, WsStyle wsStyle, List list, List list2, List list3, WsSponsors wsSponsors, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i11 & 511)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 511, WsSpecifics$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.about = str2;
        this.subtitle = str3;
        this.cta = str4;
        this.imageFull = str5;
        this.imagePreview = str6;
        this.style = wsStyle;
        this.tags = list;
        this.features = list2;
        if ((i11 & 512) == 0) {
            this.screenshots = null;
        } else {
            this.screenshots = list3;
        }
        if ((i11 & 1024) == 0) {
            this.sponsors = null;
        } else {
            this.sponsors = wsSponsors;
        }
        if ((i11 & ModuleCopy.f28574b) == 0) {
            this.devices = null;
        } else {
            this.devices = list4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsSpecifics copy$default(WsSpecifics wsSpecifics, String str, String str2, String str3, String str4, String str5, String str6, WsStyle wsStyle, List list, List list2, List list3, WsSponsors wsSponsors, List list4, int i11, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        WsStyle wsStyle2;
        List<String> list5;
        List<WsFeature> list6;
        List<WsScreenshot> list7;
        WsSponsors wsSponsors2;
        List<WsDevice> list8;
        if ((i11 & 1) != 0) {
            str7 = wsSpecifics.title;
        } else {
            str7 = str;
        }
        if ((i11 & 2) != 0) {
            str8 = wsSpecifics.about;
        } else {
            str8 = str2;
        }
        if ((i11 & 4) != 0) {
            str9 = wsSpecifics.subtitle;
        } else {
            str9 = str3;
        }
        if ((i11 & 8) != 0) {
            str10 = wsSpecifics.cta;
        } else {
            str10 = str4;
        }
        if ((i11 & 16) != 0) {
            str11 = wsSpecifics.imageFull;
        } else {
            str11 = str5;
        }
        if ((i11 & 32) != 0) {
            str12 = wsSpecifics.imagePreview;
        } else {
            str12 = str6;
        }
        if ((i11 & 64) != 0) {
            wsStyle2 = wsSpecifics.style;
        } else {
            wsStyle2 = wsStyle;
        }
        if ((i11 & 128) != 0) {
            list5 = wsSpecifics.tags;
        } else {
            list5 = list;
        }
        if ((i11 & 256) != 0) {
            list6 = wsSpecifics.features;
        } else {
            list6 = list2;
        }
        if ((i11 & 512) != 0) {
            list7 = wsSpecifics.screenshots;
        } else {
            list7 = list3;
        }
        if ((i11 & 1024) != 0) {
            wsSponsors2 = wsSpecifics.sponsors;
        } else {
            wsSponsors2 = wsSponsors;
        }
        if ((i11 & ModuleCopy.f28574b) != 0) {
            list8 = wsSpecifics.devices;
        } else {
            list8 = list4;
        }
        return wsSpecifics.copy(str7, str8, str9, str10, str11, str12, wsStyle2, list5, list6, list7, wsSponsors2, list8);
    }

    public static final /* synthetic */ void write$Self$android_release(WsSpecifics wsSpecifics, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, wsSpecifics.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wsSpecifics.about);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, wsSpecifics.subtitle);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, wsSpecifics.cta);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, wsSpecifics.imageFull);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, wsSpecifics.imagePreview);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, WsStyle$$serializer.INSTANCE, wsSpecifics.style);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], wsSpecifics.tags);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], wsSpecifics.features);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || wsSpecifics.screenshots != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], wsSpecifics.screenshots);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || wsSpecifics.sponsors != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, WsSponsors$$serializer.INSTANCE, wsSpecifics.sponsors);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || wsSpecifics.devices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], wsSpecifics.devices);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final List<WsScreenshot> component10() {
        return this.screenshots;
    }

    public final WsSponsors component11() {
        return this.sponsors;
    }

    public final List<WsDevice> component12() {
        return this.devices;
    }

    public final String component2() {
        return this.about;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.cta;
    }

    public final String component5() {
        return this.imageFull;
    }

    public final String component6() {
        return this.imagePreview;
    }

    public final WsStyle component7() {
        return this.style;
    }

    public final List<String> component8() {
        return this.tags;
    }

    public final List<WsFeature> component9() {
        return this.features;
    }

    public final WsSpecifics copy(String title, String about, String subtitle, String cta, String imageFull, String imagePreview, WsStyle style, List<String> tags, List<WsFeature> features, List<WsScreenshot> list, WsSponsors wsSponsors, List<WsDevice> list2) {
        u.j(title, "title");
        u.j(about, "about");
        u.j(subtitle, "subtitle");
        u.j(cta, "cta");
        u.j(imageFull, "imageFull");
        u.j(imagePreview, "imagePreview");
        u.j(style, "style");
        u.j(tags, "tags");
        u.j(features, "features");
        return new WsSpecifics(title, about, subtitle, cta, imageFull, imagePreview, style, tags, features, list, wsSponsors, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsSpecifics)) {
            return false;
        }
        WsSpecifics wsSpecifics = (WsSpecifics) obj;
        if (u.e(this.title, wsSpecifics.title) && u.e(this.about, wsSpecifics.about) && u.e(this.subtitle, wsSpecifics.subtitle) && u.e(this.cta, wsSpecifics.cta) && u.e(this.imageFull, wsSpecifics.imageFull) && u.e(this.imagePreview, wsSpecifics.imagePreview) && u.e(this.style, wsSpecifics.style) && u.e(this.tags, wsSpecifics.tags) && u.e(this.features, wsSpecifics.features) && u.e(this.screenshots, wsSpecifics.screenshots) && u.e(this.sponsors, wsSpecifics.sponsors) && u.e(this.devices, wsSpecifics.devices)) {
            return true;
        }
        return false;
    }

    public final String getAbout() {
        return this.about;
    }

    public final String getCta() {
        return this.cta;
    }

    public final List<WsDevice> getDevices() {
        return this.devices;
    }

    public final List<WsFeature> getFeatures() {
        return this.features;
    }

    public final String getImageFull() {
        return this.imageFull;
    }

    public final String getImagePreview() {
        return this.imagePreview;
    }

    public final List<WsScreenshot> getScreenshots() {
        return this.screenshots;
    }

    public final WsSponsors getSponsors() {
        return this.sponsors;
    }

    public final WsStyle getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int b10 = e.b(this.features, e.b(this.tags, (this.style.hashCode() + d.c(this.imagePreview, d.c(this.imageFull, d.c(this.cta, d.c(this.subtitle, d.c(this.about, this.title.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31);
        List<WsScreenshot> list = this.screenshots;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = (b10 + hashCode) * 31;
        WsSponsors wsSponsors = this.sponsors;
        if (wsSponsors == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = wsSponsors.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        List<WsDevice> list2 = this.devices;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.about;
        String str3 = this.subtitle;
        String str4 = this.cta;
        String str5 = this.imageFull;
        String str6 = this.imagePreview;
        WsStyle wsStyle = this.style;
        List<String> list = this.tags;
        List<WsFeature> list2 = this.features;
        List<WsScreenshot> list3 = this.screenshots;
        WsSponsors wsSponsors = this.sponsors;
        List<WsDevice> list4 = this.devices;
        StringBuilder b10 = l0.b("WsSpecifics(title=", str, ", about=", str2, ", subtitle=");
        b.d(b10, str3, ", cta=", str4, ", imageFull=");
        b.d(b10, str5, ", imagePreview=", str6, ", style=");
        b10.append(wsStyle);
        b10.append(", tags=");
        b10.append(list);
        b10.append(", features=");
        a.a(b10, list2, ", screenshots=", list3, ", sponsors=");
        b10.append(wsSponsors);
        b10.append(", devices=");
        b10.append(list4);
        b10.append(")");
        return b10.toString();
    }

    public WsSpecifics(String title, String about, String subtitle, String cta, String imageFull, String imagePreview, WsStyle style, List<String> tags, List<WsFeature> features, List<WsScreenshot> list, WsSponsors wsSponsors, List<WsDevice> list2) {
        u.j(title, "title");
        u.j(about, "about");
        u.j(subtitle, "subtitle");
        u.j(cta, "cta");
        u.j(imageFull, "imageFull");
        u.j(imagePreview, "imagePreview");
        u.j(style, "style");
        u.j(tags, "tags");
        u.j(features, "features");
        this.title = title;
        this.about = about;
        this.subtitle = subtitle;
        this.cta = cta;
        this.imageFull = imageFull;
        this.imagePreview = imagePreview;
        this.style = style;
        this.tags = tags;
        this.features = features;
        this.screenshots = list;
        this.sponsors = wsSponsors;
        this.devices = list2;
    }

    public /* synthetic */ WsSpecifics(String str, String str2, String str3, String str4, String str5, String str6, WsStyle wsStyle, List list, List list2, List list3, WsSponsors wsSponsors, List list4, int i11, m mVar) {
        this(str, str2, str3, str4, str5, str6, wsStyle, list, list2, (i11 & 512) != 0 ? null : list3, (i11 & 1024) != 0 ? null : wsSponsors, (i11 & ModuleCopy.f28574b) != 0 ? null : list4);
    }
}
