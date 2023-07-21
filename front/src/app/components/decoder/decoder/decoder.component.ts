import { Component, OnInit } from '@angular/core';
import { Decoder } from '../model/decoder';
import { DecoderService } from '../decoder.service';

@Component({
  selector: 'app-decoder',
  templateUrl: './decoder.component.html',
  styleUrls: ['./decoder.component.css']
})

export class DecoderComponent implements OnInit {

  panelOpenState = false;
  decoder = {} as Decoder;

  constructor(private decoderService: DecoderService) {}

  ngOnInit(): void { };

  decodeMessage(): void {
    this.decoderService.decodeMessage(this.decoder)
      .subscribe(() => {});
  }

}
