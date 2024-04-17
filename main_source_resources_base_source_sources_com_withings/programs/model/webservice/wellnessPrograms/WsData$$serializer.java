package com.withings.programs.model.webservice.wellnessPrograms;

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
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsData.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/wellnessPrograms/WsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/wellnessPrograms/WsData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsData$$serializer implements GeneratedSerializer<WsData> {
    public static final WsData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsData$$serializer wsData$$serializer = new WsData$$serializer();
        INSTANCE = wsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.wellnessPrograms.WsData", wsData$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("thumbnail", false);
        pluginGeneratedSerialDescriptor.addElement("duration", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("capabilities", false);
        pluginGeneratedSerialDescriptor.addElement("eventInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsData$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = WsData.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(kSerializerArr[6]);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[7]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, WsDuration$$serializer.INSTANCE, WsCategory$$serializer.INSTANCE, nullable, nullable2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        List list;
        List list2;
        WsCategory wsCategory;
        WsDuration wsDuration;
        String str;
        String str2;
        String str3;
        String str4;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsData.$childSerializers;
        int i12 = 5;
        String str5 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 3);
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 7, kSerializerArr[7], null);
            str = decodeStringElement;
            wsCategory = (WsCategory) beginStructure.decodeSerializableElement(descriptor2, 5, WsCategory$$serializer.INSTANCE, null);
            str4 = decodeStringElement4;
            wsDuration = (WsDuration) beginStructure.decodeSerializableElement(descriptor2, 4, WsDuration$$serializer.INSTANCE, null);
            str3 = decodeStringElement3;
            i11 = 255;
            list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            str2 = decodeStringElement2;
        } else {
            boolean z5 = true;
            int i13 = 0;
            List list3 = null;
            List list4 = null;
            WsCategory wsCategory2 = null;
            WsDuration wsDuration2 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                    case 0:
                        i13 |= 1;
                        str5 = beginStructure.decodeStringElement(descriptor2, 0);
                        i12 = 5;
                    case 1:
                        i13 |= 2;
                        str6 = beginStructure.decodeStringElement(descriptor2, 1);
                        i12 = 5;
                    case 2:
                        i13 |= 4;
                        str7 = beginStructure.decodeStringElement(descriptor2, 2);
                        i12 = 5;
                    case 3:
                        c11 = 4;
                        str8 = beginStructure.decodeStringElement(descriptor2, 3);
                        i13 |= 8;
                        i12 = 5;
                    case 4:
                        c11 = 4;
                        wsDuration2 = (WsDuration) beginStructure.decodeSerializableElement(descriptor2, 4, WsDuration$$serializer.INSTANCE, wsDuration2);
                        i13 |= 16;
                        i12 = 5;
                    case 5:
                        wsCategory2 = (WsCategory) beginStructure.decodeSerializableElement(descriptor2, i12, WsCategory$$serializer.INSTANCE, wsCategory2);
                        i13 |= 32;
                    case 6:
                        list4 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], list4);
                        i13 |= 64;
                    case 7:
                        list3 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 7, kSerializerArr[7], list3);
                        i13 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i13;
            list = list3;
            list2 = list4;
            wsCategory = wsCategory2;
            wsDuration = wsDuration2;
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
        }
        beginStructure.endStructure(descriptor2);
        return new WsData(i11, str, str2, str3, str4, wsDuration, wsCategory, list2, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsData value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsData.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
