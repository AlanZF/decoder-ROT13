import { Component, OnInit } from '@angular/core';
import { Decoder } from '../model/decoder';
import { DecodeMessageService } from '../decoder.service';

@Component({
  selector: 'decoder-decoderM',
  templateUrl: './decoder.component.html',
  styleUrls: ['./decoder.component.css']
})
export class DecoderComponent implements OnInit {

  decoder = {} as Decoder;

  constructor(private service: DecodeMessageService) { }

  ngOnInit(): void { }

  decoderMessage(): void {
    this.service.decodeMessage(this.decoder).subscribe(() => {});
  }

}
