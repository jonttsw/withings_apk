package com.withings.programs.model.webservice.wellnessPrograms;

import com.huawei.hms.feature.dynamic.ModuleCopy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WsSpecifics.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/wellnessPrograms/WsSpecifics.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/wellnessPrograms/WsSpecifics;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsSpecifics$$serializer implements GeneratedSerializer<WsSpecifics> {
    public static final WsSpecifics$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsSpecifics$$serializer wsSpecifics$$serializer = new WsSpecifics$$serializer();
        INSTANCE = wsSpecifics$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.wellnessPrograms.WsSpecifics", wsSpecifics$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("about", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("cta", false);
        pluginGeneratedSerialDescriptor.addElement("imageFull", false);
        pluginGeneratedSerialDescriptor.addElement("imagePreview", false);
        pluginGeneratedSerialDescriptor.addElement(XHTMLText.STYLE, false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("features", false);
        pluginGeneratedSerialDescriptor.addElement("screenshots", true);
        pluginGeneratedSerialDescriptor.addElement("sponsors", true);
        pluginGeneratedSerialDescriptor.addElement("devices", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsSpecifics$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = WsSpecifics.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[7];
        KSerializer<?> kSerializer2 = kSerializerArr[8];
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(kSerializerArr[9]);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(WsSponsors$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializersKt.getNullable(kSerializerArr[11]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, WsStyle$$serializer.INSTANCE, kSerializer, kSerializer2, nullable, nullable2, nullable3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsSpecifics deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        List list2;
        WsSponsors wsSponsors;
        List list3;
        int i11;
        List list4;
        WsStyle wsStyle;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsSpecifics.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 3);
            String decodeStringElement5 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement6 = beginStructure.decodeStringElement(descriptor2, 5);
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 11, kSerializerArr[11], null);
            str = decodeStringElement;
            wsSponsors = (WsSponsors) beginStructure.decodeNullableSerializableElement(descriptor2, 10, WsSponsors$$serializer.INSTANCE, null);
            wsStyle = (WsStyle) beginStructure.decodeSerializableElement(descriptor2, 6, WsStyle$$serializer.INSTANCE, null);
            str6 = decodeStringElement6;
            str4 = decodeStringElement4;
            str5 = decodeStringElement5;
            str3 = decodeStringElement3;
            i11 = 4095;
            list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 9, kSerializerArr[9], null);
            list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], null);
            str2 = decodeStringElement2;
        } else {
            int i12 = 11;
            List list5 = null;
            List list6 = null;
            WsSponsors wsSponsors2 = null;
            List list7 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            boolean z5 = true;
            List list8 = null;
            int i13 = 0;
            WsStyle wsStyle2 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 11;
                    case 0:
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        i13 |= 1;
                        i12 = 11;
                    case 1:
                        str8 = beginStructure.decodeStringElement(descriptor2, 1);
                        i13 |= 2;
                        i12 = 11;
                    case 2:
                        str9 = beginStructure.decodeStringElement(descriptor2, 2);
                        i13 |= 4;
                        i12 = 11;
                    case 3:
                        str10 = beginStructure.decodeStringElement(descriptor2, 3);
                        i13 |= 8;
                        i12 = 11;
                    case 4:
                        str11 = beginStructure.decodeStringElement(descriptor2, 4);
                        i13 |= 16;
                        i12 = 11;
                    case 5:
                        c11 = 6;
                        str12 = beginStructure.decodeStringElement(descriptor2, 5);
                        i13 |= 32;
                        i12 = 11;
                    case 6:
                        c11 = 6;
                        wsStyle2 = (WsStyle) beginStructure.decodeSerializableElement(descriptor2, 6, WsStyle$$serializer.INSTANCE, wsStyle2);
                        i13 |= 64;
                        i12 = 11;
                    case 7:
                        list8 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, kSerializerArr[7], list8);
                        i13 |= 128;
                    case 8:
                        list7 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, kSerializerArr[8], list7);
                        i13 |= 256;
                    case 9:
                        list6 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 9, kSerializerArr[9], list6);
                        i13 |= 512;
                    case 10:
                        wsSponsors2 = (WsSponsors) beginStructure.decodeNullableSerializableElement(descriptor2, 10, WsSponsors$$serializer.INSTANCE, wsSponsors2);
                        i13 |= 1024;
                    case 11:
                        list5 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, i12, kSerializerArr[i12], list5);
                        i13 |= ModuleCopy.f28574b;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            list = list5;
            list2 = list6;
            wsSponsors = wsSponsors2;
            list3 = list7;
            i11 = i13;
            list4 = list8;
            wsStyle = wsStyle2;
            str = str7;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str11;
            str6 = str12;
        }
        beginStructure.endStructure(descriptor2);
        return new WsSpecifics(i11, str, str2, str3, str4, str5, str6, wsStyle, list4, list3, list2, wsSponsors, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsSpecifics value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsSpecifics.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
