package com.withings.programs.model.webservice.enrolledProgram;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsSpecifics.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/webservice/enrolledProgram/WsSpecifics.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/webservice/enrolledProgram/WsSpecifics;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsSpecifics$$serializer implements GeneratedSerializer<WsSpecifics> {
    public static final WsSpecifics$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsSpecifics$$serializer wsSpecifics$$serializer = new WsSpecifics$$serializer();
        INSTANCE = wsSpecifics$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.webservice.enrolledProgram.WsSpecifics", wsSpecifics$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("imagePreview", false);
        pluginGeneratedSerialDescriptor.addElement("imageFull", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsSpecifics$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = WsSpecifics.$childSerializers;
        KSerializer<?> kSerializer = kSerializerArr[3];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsSpecifics deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        String str;
        String str2;
        String str3;
        List list;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = WsSpecifics.$childSerializers;
        String str4 = null;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            str = decodeStringElement;
            str3 = decodeStringElement3;
            i11 = 15;
            str2 = decodeStringElement2;
        } else {
            boolean z5 = true;
            int i12 = 0;
            String str5 = null;
            String str6 = null;
            List list2 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    z5 = false;
                } else if (decodeElementIndex == 0) {
                    str4 = beginStructure.decodeStringElement(descriptor2, 0);
                    i12 |= 1;
                } else if (decodeElementIndex == 1) {
                    str5 = beginStructure.decodeStringElement(descriptor2, 1);
                    i12 |= 2;
                } else if (decodeElementIndex == 2) {
                    str6 = beginStructure.decodeStringElement(descriptor2, 2);
                    i12 |= 4;
                } else if (decodeElementIndex != 3) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], list2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = str4;
            str2 = str5;
            str3 = str6;
            list = list2;
        }
        beginStructure.endStructure(descriptor2);
        return new WsSpecifics(i11, str, str2, str3, list, null);
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
