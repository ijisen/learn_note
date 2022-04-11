export type MatchedDataOptions = {
  include: boolean;
  only: boolean;
};


// Partial<MatchedDataOptions> === anyOpts
export type anyOpts = {
  include?: boolean | undefined;
  only?: boolean | undefined;
}

export function matchedData(options: Partial<MatchedDataOptions> = {}) {
  console.log(options)
}


function getData(options: MatchedDataOptions = {include: true, only: false}) {
  console.log(options)
}