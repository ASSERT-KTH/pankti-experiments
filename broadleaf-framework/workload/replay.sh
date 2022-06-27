#!/bin/bash

goreplay --input-file requests.gor --input-raw-track-response --output-http "http://localhost:8080" --middleware "./goreplay_middleware_broadleaf.py" --stats --output-http-stats
