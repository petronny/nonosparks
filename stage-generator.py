import json
stage='01'
data={}
data['width']=3
data['height']=3
data['hints']={}
data['hints']['horizontal']=['1','3','1']
data['hints']['vertical']=['3','1','1']
data['answer']=[]
data['answer'].append([1,1,1])
data['answer'].append([0,1,0])
data['answer'].append([0,1,0])
data['tips']=[]
line={}
line['type']='text'
line['content']='More Tips:'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Start with the highest numbers.'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Some number combinations have only one solution.'
line={}
line['type']='example'
line['content']='examples/01-1.json'
data['tips'].append(line)
json.dump(data,open('stages/'+stage+'.json','w'))
